var areaOfMaxDiagonal = function (dimensions) {
    let max = 0;
    let area = 0;

    for (let i = 0; i < dimensions.length; i++) {
        let width = dimensions[i][0];
        let height = dimensions[i][1];

        // calculate diagonal length
        let diagonal = Math.sqrt(width ** 2 + height ** 2);

        // check for max diagonal
        if (diagonal > max) {
            max = diagonal;
            area = width * height; // area = width × height
        }
    }
    return area;
};

console.log(areaOfMaxDiagonal([
    [9, 3],
    [8, 6]
]));

/*
# Maximum Area of Longest Diagonal Rectangle - Deep Concept Analysis

# # Problem Understanding & Mathematical Foundation

# # # The Core Problem
Given multiple rectangles with dimensions[width, height], find the rectangle with the ** longest diagonal ** .If multiple rectangles have the same longest diagonal,
    return the one with the ** maximum area ** .

# # # Why Diagonals Matter
A rectangle 's diagonal represents the **maximum distance** between any two points within that rectangle. In many real-world scenarios (shipping boxes, display screens, etc.), the diagonal is a critical constraint.

# # Deep Dive into Key Concepts

# # # 1. ** Pythagorean Theorem - The Mathematical Foundation **

    # # # # Basic Formula
For a rectangle with width `w`
and height `h`:
    -Diagonal length = √(w² + h²)

# # # # Why We Use d² Instead of d ``
`javascript
// Instead of this (prone to floating point errors):
const diagonal = Math.sqrt(w * w + h * h);

// We use this (exact integer comparison):
const d2 = w * w + h * h;
`
``

**
Reasoning: **
    - ** Floating Point Issues **: √25 might not exactly equal√ 25 due to precision -
    ** Performance **: Avoiding square root calculation saves computation -
    ** Accuracy **: Integer comparison(25 vs 26) is always exact -
    ** Mathematical Validity **: If d₁² > d₂², then d₁ > d₂(monotonic property)

# # # # Mathematical Proof of Approach ``
`
If d₁² > d₂², then d₁ > d₂
Proof: 
- d₁, d₂ > 0 (diagonals are positive)
- If d₁² > d₂², taking square root of both sides preserves inequality
- Therefore d₁ > d₂
`
``

# # # 2. ** Greedy Algorithm Pattern - The Strategic Approach **

    # # # # What Makes This Greedy ?
    A greedy algorithm makes locally optimal choices at each step, hoping to find a global optimum.

# # # # Why Greedy Works Here
    ``
`javascript
// At each step, we ask: "Is this the best rectangle I've seen so far?"
if (d2 > maxD2 || (d2 === maxD2 && area > bestArea)) {
    // YES: Update our "best so far"
    maxD2 = d2;
    bestArea = area;
}
`
``

**
Key Properties: **
    - ** Optimal Substructure **: The best rectangle overall is the best among all rectangles -
    ** No Backtracking Needed **: Once we find a better rectangle, we don 't need to reconsider previous ones -
    ** Single Pass Efficiency **: We only need to see each rectangle once

# # # # Greedy Choice Property
At each rectangle, we make the greedy choice: "Keep this if it's better than what I have."
This local choice leads to the global optimum because:
    1. We 're looking for a single maximum value
2. The comparison criteria are transitive(
    if A > B and B > C, then A > C)

# # # 3. ** Multi - Criteria Decision Making - The Tie - Breaking Logic **

    # # # # The Decision Hierarchy ``
`
Primary Criterion: Diagonal Length (d²)
    ↓ (if tied)
Secondary Criterion: Area (w × h)
`
``

# # # # Why This Order Matters
1. ** Problem Requirements **: "Longest diagonal"
is the primary goal
2. ** Tie Resolution **: Among equal diagonals, maximum area provides a meaningful secondary criterion
3. ** Deterministic Results **: Ensures consistent output
for the same input

# # # # The Logic Breakdown
    ``
`javascript
if (d2 > maxD2 || (d2 === maxD2 && area > bestArea))
`
``

**
Case Analysis: **
    -`d2 > maxD2`: Found a longer diagonal→ ** Always update **
    -`d2 < maxD2`: Found a shorter diagonal→ ** Never update **
    -`d2 === maxD2 && area > bestArea`: Same diagonal, larger area→ ** Update **
    -`d2 === maxD2 && area <= bestArea`: Same diagonal, smaller / equal area→ ** Don 't update**

# # # 4. ** Array Destructuring & Modern JavaScript Patterns **

    # # # # Destructuring Assignment ``
`javascript
const [w, h] = dimensions[i];
`
``

**
Deep Explanation: **
    - ** Pattern Matching **: Automatically extracts array elements into variables -
    ** Readability **: `w`
and `h`
are more meaningful than `dimensions[i][0]`
and `dimensions[i][1]` -
    ** Performance **: Modern JavaScript engines optimize destructuring well -
    ** Error Prevention **: Clear variable names reduce mistakes

# # # 5. ** Defensive Programming - Handling Edge Cases **

    # # # # The Extra Nesting Check ``
`javascript
if (dimensions.length === 1 && Array.isArray(dimensions[0][0])) {
    dimensions = dimensions[0];
}
`
``

**
Why This Matters: **
    - ** API Flexibility **: Handles both `[[w,h], [w,h]]`
and `[[[w,h], [w,h]]]` -
    ** Error Prevention **: Avoids crashes from unexpected input format -
    ** Graceful Degradation **: Code works even with slightly malformed input

# # Algorithm Complexity Analysis

# # # Time Complexity: O(n) -
    ** Single Loop **: We iterate through each rectangle exactly once -
    ** Constant Operations **: Each iteration performs O(1) operations -
    ** No Nested Loops **: No sorting or searching required -
    ** Optimal
for Problem **: We must examine every rectangle at least once

# # # Space Complexity: O(1) -
    ** Fixed Variables **: Only `maxD2`, `bestArea`, `w`, `h`, `d2`, `area` -
    ** No Additional Data Structures **: No arrays, objects, or recursion stack -
    ** In - Place Processing **: We don 't create copies of the input

# # Real - World Applications & Extensions

# # # Practical Scenarios
1. ** Package Shipping **: Finding the largest box that fits through a diagonal constraint
2. ** Screen Manufacturing **: Optimizing screen size within diagonal limits
3. ** Architecture **: Maximizing room area within diagonal building constraints

# # # Possible Extensions
1. ** Multiple Criteria **: Adding weight, cost, or other factors
2. ** Tolerance Ranges **: "Approximately equal"
diagonals within epsilon
3. ** 3 D Version **: Extending to boxes with space diagonals

# # Common Pitfalls & How the Code Avoids Them

# # # 1. Floating Point Precision
    **
    Problem **: `Math.sqrt(25) === 5.000000001`
on some systems
    **
    Solution **: Compare `d²`
values(integers) instead

# # # 2. Tie - Breaking Ambiguity **
    Problem **: What
if diagonals are equal ?
    **
    Solution ** : Clear secondary criterion(maximum area)

# # # 3. Input Format Assumptions
    **
    Problem **: Code breaks with unexpected nesting **
    Solution **: Defensive check
for extra nesting

# # # 4. Initialization Issues
    **
    Problem **: Starting with `maxD2 = 0`
fails
for all negative dimensions
    **
    Solution **: `maxD2 = -1`
ensures first rectangle is always considered

# # Mathematical Insights

# # # Why Area as Tie - Breaker Makes Sense
Given two rectangles with the same diagonal:
    -Rectangle 1: 3× 4(diagonal² = 25, area = 12) -
    Rectangle 2: 5× 0(diagonal² = 25, area = 0)

Both have the same diagonal, but Rectangle 1 is clearly more useful in practical applications.

# # # The Optimization Landscape
This problem has a ** discrete optimization ** nature:
    - ** Feasible Solutions **: All given rectangles -
    ** Objective Function **: Lexicographic ordering(diagonal first, area second) -
    ** Global Optimum **: The single best rectangle according to our criteria

The greedy approach works because we 're selecting from a finite, pre-defined set rather than constructing a solution from scratch.
*/