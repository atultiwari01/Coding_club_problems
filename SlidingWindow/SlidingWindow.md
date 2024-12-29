# Sliding Window
The **sliding window algorithm** is a technique used to solve problems involving arrays or lists where you need to find a subrange (or subset) of elements that satisfies certain conditions. It's particularly effective for problems that involve contiguous subarrays, such as finding the maximum sum of a subarray of size \( k \), or checking for specific patterns within a string.

### Key Idea
The algorithm uses a "window" that slides over the data structure, adjusting its size or position as needed, to efficiently compute results. Instead of repeatedly iterating over the array for every possible subrange, the sliding window optimizes the process by reusing previous computations.

---

### Steps of the Sliding Window Algorithm
1. **Initialization**:
   - Define the start and end of the window, often as indices in the array.
   - Initialize variables to store intermediate results (e.g., current sum, count, or condition checks).

2. **Expand the Window**:
   - Move the "end" pointer forward to include new elements in the window.

3. **Shrink the Window** (if necessary):
   - Move the "start" pointer forward to reduce the size of the window when certain conditions are met (e.g., the window exceeds a certain size or condition).

4. **Update Results**:
   - As the window slides, update the result (e.g., maximum sum, smallest subarray length) based on the current window.

---

### Advantages
- Reduces time complexity compared to brute-force solutions.
- Works well for problems requiring efficient computation of overlapping subproblems.

### Complexity
- **Time Complexity**: \( O(n) \), as each element is visited at most twice (once by the start pointer and once by the end pointer).
- **Space Complexity**: Typically \( O(1) \) for simple problems, but may require extra space for more complex problems (e.g., a set or dictionary for character frequency).