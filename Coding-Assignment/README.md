# Week 10 — Coding Assignment Problems

1. Second-Best Score — single pass; no sorting.
2. Exam Score Band Counter — lower-bound and upper-bound binary searches on a sorted array.
3. Duty Roster Rotation — right rotation using k modulo array length.
4. Class Attendance Tracker — count present days and longest streak in one pass.
5. Busiest Bus Row — sum each grid row and keep the first row in a tie.

Each program is standalone. Inputs are whitespace-separated; for array problems, enter the item count first, then the array elements. For Busiest Bus Row, enter rows and columns followed by the grid values.

## Complexity summary
- Second-Best Score: O(n) time, O(1) auxiliary space; sorting would take O(n log n).
- Exam Score Band Counter: O(log n) time, O(1) auxiliary space; linear scanning takes O(n).
- Duty Roster Rotation: O(n) time and O(n) extra space for the rotated result, independent of the magnitude of k.
- Class Attendance Tracker: O(n) time, O(1) auxiliary space.
- Busiest Bus Row: O(r × c) time, O(1) auxiliary space beyond the input grid.
