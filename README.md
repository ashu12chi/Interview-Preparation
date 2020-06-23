# Interview-Preparation
This repository is created for the interview preparation of software companies.

|Number| Question | Link | Solution Idea | Solution Link | Category| Company|
| ---- | -------- | ---- | ------------- | ------------- | ------- | ------ |
|1.| Find the repeating and missing number in array | https://www.interviewbit.com/problems/repeat-and-missing-number-array/ | <details><summary>Spoiler...</summary>Solve simultaneous equations created by either using sum and sum of squares or XORs or sum and product</details> | https://pastebin.com/ZA8Wfe76|| Amazon|
|2.| Merge two sorted array without extra space| https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays/0/ | <details><summary>Spoiler...</summary>Initialize i=0 and j=n-1 and swap(ar2[i],ar1[j]) while ar2[i] < ar1[j] and then sort(ar1,ar1+n) and sort(ar2,ar2+m) individually.</details>| https://github.com/ashu12chi/Interview-Preparation/blob/master/Merge-two-sorted-arrays.cpp ||Amazon,Goldman Sachs,Microsoft,Visa,LinkedIn|
|3.| Minimum platforms needed for arrival and departure | https://practice.geeksforgeeks.org/problems/minimum-platforms/0 | <details><summary>Spoiler...</summary>Make a vector of pair of {time,('a'/'d')} and sort it. Initialize curr = 0 and if(v[i].second = 'a') curr++ else curr--, maximum value reached is ans.</details>| https://github.com/ashu12chi/Interview-Preparation/blob/master/Minimum-platform.cpp ||Amazon,Oyo Rooms,Paytm,D-E-Shaw,Walmart,Directi,Morgan Satnley|
|4.| Binary Tree Cameras | https://leetcode.com/problems/binary-tree-cameras/ |<details><summary>Spoiler...</summary>(Solution to this problem is LeetCode public)</details>|https://github.com/ashu12chi/Interview-Preparation/blob/master/BinaryTreeCameras.java | Greedy/ DP |
|5.| Trapping rain water - 1d| https://practice.geeksforgeeks.org/problems/trapping-rain-water/0 |<details><summary>Spoiler...</summary> Start from the index = 0,sum=0, until find and ar[i] >= ar[index] sum += ar[i], after ans += (ar[mini]*(i-mini-1)-sum), after array ends repeat this from right to left till last index found </details>| https://github.com/ashu12chi/Interview-Preparation/blob/master/Trapping-Rainwater.cpp | Greedy |Amazon,Adobe,Paytm|
|6.| Convert array into zig-zag faishon in O(n)| https://practice.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion/0|<details><summary>Spoiler...</summary> Use one pass of enhanced bubble sort </details>|https://github.com/ashu12chi/Interview-Preparation/blob/master/convert-array-into-zig-zag.cpp||Amazon,Paytm|
|7. | Remove Duplicates from Sorted List II | https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/ | <details><summary>Spoiler...</summary> Maintain a header node, current node and pre node and traverse </details> |  https://github.com/ashu12chi/Interview-Preparation/blob/master/RemoveDuplicatesFromSortedListII.java | Linked List | |
|8. | Largest number formed from array of non negative numbers|https://practice.geeksforgeeks.org/problems/largest-number-formed-from-an-array/0|<details><summary>Spoiler...</summary> Using comparison based sorting </details>|https://github.com/ashu12chi/Interview-Preparation/blob/master/largest-number-formed-from-array.cpp |Sorting/Greedy|Amazon,MakeMyTrip,Microsft,Paytm|
|9. | First Missing Integer |https://www.interviewbit.com/problems/first-missing-integer/|<details><summary>Spoiler...</summary> Use the original array as freq array</details>|.. |Array|Amazon|
