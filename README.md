# Interview-Preparation
This repository is created for the interview preparation of software companies.

For external links to articles worth reading and solving on Programming topics [visit this link](https://github.com/ashu12chi/Interview-Preparation/blob/master/ExternalLinks.md).

|Number| Question | Link | Solution Idea | Solution Link | Category| Company|
| ---- | -------- | ---- | ------------- | ------------- | ------- | ------ |
|1.| Find the repeating and missing number in array | https://www.interviewbit.com/problems/repeat-and-missing-number-array/ | <details><summary>Spoiler...</summary>Solve simultaneous equations created by either using sum and sum of squares or XORs or sum and product</details> | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/RepeatAndMissingNumberArray.java|| Amazon|
|2.| Merge two sorted array without extra space| https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays/0/ | <details><summary>Spoiler...</summary>Initialize i=0 and j=n-1 and swap(ar2[i],ar1[j]) while ar2[i] < ar1[j] and then sort(ar1,ar1+n) and sort(ar2,ar2+m) individually.</details>| https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/Merge-two-sorted-arrays.cpp ||Amazon,Goldman Sachs,Microsoft,Visa,LinkedIn|
|3.| Minimum platforms needed for arrival and departure | https://practice.geeksforgeeks.org/problems/minimum-platforms/0 | <details><summary>Spoiler...</summary>Make a vector of pair of {time,('a'/'d')} and sort it. Initialize curr = 0 and if(v[i].second = 'a') curr++ else curr--, maximum value reached is ans.</details>| https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/Minimum-platform.cpp ||Amazon,Oyo Rooms,Paytm,D-E-Shaw,Walmart,Directi,Morgan Satnley|
|4.| Binary Tree Cameras | https://leetcode.com/problems/binary-tree-cameras/ |<details><summary>Spoiler...</summary>(Solution to this problem is LeetCode public)</details>|https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/BinaryTreeCameras.java | Greedy/ DP |
|5.| Trapping rain water - 1d| https://practice.geeksforgeeks.org/problems/trapping-rain-water/0 |<details><summary>Spoiler...</summary> Start from the index = 0,sum=0, until find and ar[i] >= ar[index] sum += ar[i], after ans += (ar[mini]*(i-mini-1)-sum), after array ends repeat this from right to left till last index found </details>| https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/Trapping-Rainwater.cpp | Greedy |Amazon,Adobe,Paytm|
|6.| Convert array into zig-zag faishon in O(n)| https://practice.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion/0|<details><summary>Spoiler...</summary> Use one pass of enhanced bubble sort </details>|https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/convert-array-into-zig-zag.cpp||Amazon,Paytm|
|7. | Remove Duplicates from Sorted List II | https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/ | <details><summary>Spoiler...</summary> Maintain a header node, current node and pre node and traverse </details> |  https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/RemoveDuplicatesFromSortedListII.java | Linked List | |
|8. | Largest number formed from array of non negative numbers|https://practice.geeksforgeeks.org/problems/largest-number-formed-from-an-array/0|<details><summary>Spoiler...</summary> Using comparison based sorting </details>|https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/largest-number-formed-from-array.cpp |Sorting/Greedy|Amazon,MakeMyTrip,Microsft,Paytm|
|9. | First Missing Integer |https://www.interviewbit.com/problems/first-missing-integer/|<details><summary>Spoiler...</summary> Use the original array as freq array</details>|https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/FirstMissingInteger.java |Array|Amazon|
|10.| Majority element in an array in O(n) time and O(1) space|https://practice.geeksforgeeks.org/problems/majority-element/0|<details><summary>Spoiler...</summary>Use Moore's voting algorithm</details>|https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/Majority-element.cpp ||Amazon,Samsung,Microsoft,Makemytrip,D-E-Shaw|
|11.| Max Distance in O(n) |https://www.interviewbit.com/problems/max-distance/|<details><summary>Spoiler...</summary>Maintain smallest element of prefix and largest element of suffix</details>|https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/MaxDistance.java |Array| Google,Amazon,Microsoft |
| 12. | Maximum of all subarrays of size k | https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k/0/ | <details> <summary> Spoiler... </summary> Create a Deque that stores only useful elements of current window of k elements. An element is useful if it is in current window and is greater than all other elements on left side of it in current window. We process all array elements one by one and maintain deque to contain useful elements of current window and these useful elements are maintained in sorted order. The element at front of the deque is the largest and element at rear of deque is the smallest of current window. </details> | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/MaximumAllSubarraysSizeK.java | Array, Queue, Sliding-window | Amazon, Cisco, Directi, Flipkart, SAP Labs, Zoho |
| 13. | Find and Replace Pattern | https://leetcode.com/problems/find-and-replace-pattern/ and https://practice.geeksforgeeks.org/problems/match-specific-pattern/1 | <details> <summary> Spoiler... </summary> Use a HashMap to store current character mappings and a HashSet to mark which characters have been used </details> | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/FindAndReplacePattern.java | Strings, Hash | Amazon, Microsoft, MakeMyTrip |
| 14. | Find Permutation | https://www.interviewbit.com/problems/find-permutation/| <details> <summary> Spoiler... </summary> Maintain range [l,r] of unused elements, each time we use either l or r </details> | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/FindPermutation.java or short solution https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/Find-Permutation.cpp | Arrays | Amazon, Goldman Sachs |
| 15. | Maximum Absolute Difference | https://www.interviewbit.com/problems/maximum-absolute-difference/ | <details> <summary> Spoiler... </summary> Break the modulo into conditions </details> | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/MaxAbsDiff.java | Arrays | Amazon |
|16.| Reorder List| https://practice.geeksforgeeks.org/problems/reorder-list/1 | <details> <summary> Spoiler... </summary> split list from half, reverse second part and merge them alternatively </details> | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/Reorder-list.cpp | Linked List | Amazon,Microsoft,OYO rooms| 
|17.| Flatten linked list | https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1 |  <details> <summary> Spoiler... </summary> 🥱🥱 </details>| https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/Flatten-linked-list.cpp | Linked List | Amazon,Microsoft,Flipkart,Paytm,Visa,Qualcomm,Snapdeal|
| 18. | Minimum Height Trees | https://leetcode.com/problems/minimum-height-trees/ | <details> <summary> Spoiler... </summary> At most 2 nodes will be answer, think about it. Keep removing leaf nodes till this point. </details> | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/MinimumHeightTrees.java | Breadth First Search, Graph | |
| 19. | Numbers With Same Consecutive Differences | https://leetcode.com/problems/numbers-with-same-consecutive-differences/ | <details> <summary> Spoiler... </summary> Simple Backtracking. </details> | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/NumbersWithSameConsecutiveDifferences.java | Backtracking | |
| 20. | Flatten a Multilevel Doubly Linked List | https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/ | <details> <summary> Spoiler... </summary> Nothing special, go, just do it... </details> | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/FlattenMultilevelDoublyLinkedList.java | Linked List, Depth First Search | |
| 21. | Rotated Sorted Array Search O(logn) | https://www.interviewbit.com/problems/rotated-sorted-array-search/ | <details> <summary> Spoiler... </summary> Binary Search twice, once for pivot,next for element </details> | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/RotatedSortedArraySearch.java | Binary Search | |
|22.| Delete without head pointer| https://practice.geeksforgeeks.org/problems/delete-without-head-pointer/1 |<details> <summary> Spoiler... </summary> swap node with next node and then delete it </details> | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/delete-without-head.cpp | Linked List | Amazon,Goldman Sach,Microsoft,Samsung,Visa|
|23.| Rotate matrix| https://www.interviewbit.com/problems/rotate-matrix/ | <details> <summary> Spoiler... </summary> Take good obsrevations </details>| https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/rotate-matrix.cpp | Arrays | Google, Facebook, Amazon|
|24.| Recover BST| https://www.interviewbit.com/problems/recover-binary-search-tree/ | <details> <summary> Spoiler... </summary> Use Morris Traversal </details>| https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/RecoverBST.java | BST | Microsoft, Amazon|
| 25. | Contains Duplicates III | https://leetcode.com/problems/contains-duplicate-iii/ | <details> <summary> Spoiler... </summary> Use buckets (map several elements to one number (probably by dividing by t or (t + 1))). To ease mapping you can origin shift numbers by subtracting Integer.MIN_VALUE from them (use long if you do so, I wasted a lotta time). </details> | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/ContainsDuplicateIII.java | Sort, Ordered Map, Map | |
| 26. | Single Number II | https://www.interviewbit.com/problems/single-number-ii/ | <details> <summary> Spoiler... </summary> Find cnt of ones at each bit </details> | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/SingleNumberII.java | BitWise Manipulation | |
| 27. | Divide Integers | https://www.interviewbit.com/problems/divide-integers/ | <details> <summary> Spoiler... </summary> Find the quotient from msb to lsb </details> | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/DivideIntegers.java | BitWise Manipulation | |
| 28. | 3 sum | https://www.interviewbit.com/problems/3-sum/ | <details> <summary> Spoiler... </summary> Fix one number and then use two pointer </details> | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/3-sum.cpp | Two pointer | Facebook,Amazon,Microsoft |
| 29. | Largest rectangle in Histogram | https://www.interviewbit.com/problems/largest-rectangle-in-histogram/ | <details> <summary> Spoiler... </summary> Use stack smartly </details> | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/largest-rectangle-in-histogram.cpp | Stack | Google,Facebook,Amzon| 
|30.| Bottom View of Binary Tree | https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1 | <details> <summary> Spoiler... </summary> Use map<dist,pair<value,level>> for same dist use value with highest level </details> | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/Bottom-View-Of-Binary-Tree.cpp | Binary Tree | Amazon,Paytm,OyoRooms,Walmart,Flipkart |
|31.| Left View of Binary Tree | https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1 | <details> <summary> Spoiler... </summary> Use recursion with level,max_level if level > max_level print node and update max_level </details> |  https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/Left-View-Of-binary-Tree.cpp | Binary Tree | Amazon,Paytm,OyoRooms,Samsung,Flipkart |
|32.| Maximum path sum| https://practice.geeksforgeeks.org/problems/maximum-path-sum/1 | <details> <summary> Spoiler... </summary> recursively call pathsum function to find continuous sum and pass one refernece variable to store maxsum </details> | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/maximum-path-sum.cpp | Binary Tree | Amazon,Facebook,Microsoft,Oyo Rooms|
| 33. | Evaluate Division | https://leetcode.com/problems/evaluate-division/ | <details> <summary> Spoiler... </summary> Created a weighted graph with forward edges with weight val, and reverse edges with weight 1/val and do a simple dfs with multiplication of weights at each step to get answer. This problem can also be solved using Union-Find | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/EvaluateDivision.java | Graph, Union-Find, DFS | |
| 34. | Circular Array Loop | https://leetcode.com/problems/circular-array-loop/ | <details> <summary> Spoiler... </summary> Use the concept of hare and tortoise (two pointers) as used in Linked lists to find loops </details> | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/CircularArrayLoop.java | Array, Two Pointers | |
| 35. | Intersection Point in Y Shapped Linked Lists | Solve strictly using O(1) auxillary space: https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1/ | <details> <summary> Spoiler... </summary> Change sign of numbers as you traverse :D </details> | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/IntersectionPointInYShappedLinkedLists.java | Linked Lists | Accolite, Adobe, Amazon, D E Shaw, FactSet, Flipkart, Goldman Sachs, MakeMyTrip, MAQ Software, Microsoft, Qualcomm, Snapdeal, Visa, VMWare |
| 36.|Find median in a stream | https://practice.geeksforgeeks.org/problems/find-median-in-a-stream/0 | <details> <summary> Spoiler... </summary> Use two heaps </details>|https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/find-median-in-a-stream.cpp | Heap | Adobe,Amazon,Apple,Facebook,Google,Microsoft,Walmart,Samsung,Samsung,Sap labs,Yahoo,Oracle,Oyo Rooms,Morgan Stanley,Ola|
|37.|Special Keyboard | https://practice.geeksforgeeks.org/problems/special-keyboard/0 | <details> <summary> Spoiler... </summary> Use dp </details> | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/special-keyboard.cpp | Recursion | Amazon,Google,Paytm |
|38.|josephus-problem | https://practice.geeksforgeeks.org/problems/josephus-problem/1 | <details> <summary> Spoiler... </summary> Standard recusrive approach </details> | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/josephus-problem.cpp | Recusrion | Amazon, Walmart | 
| 39. | Minimum ASCII Delete Sum for Two Strings | https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/ | <details> <summary> Spoiler... </summary> It is similar to "Edit Distance" problem. Solve by dynamic programming (1st try to figure out Backtracking Soln). Use a 2D array to store ans value up to certain lengths of the 2 strings. If characters are equal skip. If not equal, then atleast one of them has to be removed. </details> | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/MinimumASCIIDeleteSumForTwoStrings.java | Dynamic Programming | |
| 40. | Maximum Points You Can Obtain from Cards | https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/ | <details> <summary> Spoiler... </summary> Use sliding window. </details> | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/MaximumPointsYouCanObtainFromCards.java | Array, Dynamic Programming, Sliding Window | |
|41. | Points on the line | https://www.interviewbit.com/problems/points-on-the-straight-line/ | <details> <summary> Spoiler... </summary> Use y = m*x+c, take care of floating point calculations ans infinte slope </details> | https://github.com/ashu12chi/Interview-Preparation/blob/master/Solutions/points-on-the-line.cpp | Hashing | Google,Amazon,InMobi |
