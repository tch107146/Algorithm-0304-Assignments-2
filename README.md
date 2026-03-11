# Assignment 2: Sorting Algorithm Empirical Observation
# 作業二：排序演算法實證觀察

📌 Project Overview | 專案概述
This project focuses on the implementation and performance comparison of three sorting algorithms: **Quick Sort**, **Insertion Sort**, and **Bubble Sort**. [cite_start]By conducting experiments with different data scales ($n$), we aim to observe the practical performance gap between $O(n \log n)$ and $O(n^2)$ complexity classes[cite: 78, 81, 353].

[cite_start]本專案重點在於實作並比較三種排序演算法：**快速排序 (Quick Sort)**、**插入排序 (Insertion Sort)** 與 **氣泡排序 (Bubble Sort)** [cite: 255, 335, 341, 370][cite_start]。透過不同資料規模（$n$）的實驗，觀察 $O(n \log n)$ 與 $O(n^2)$ 在實際執行上的巨大效能鴻溝 [cite: 366]。

🎯 Academic Objectives | 學習目標
- [cite_start]**Advanced Sorting**: Implement Quick Sort (Divide and Conquer) and compare it with elementary sorting methods[cite: 335, 341].
- [cite_start]**Efficiency Analysis**: Quantify the impact of excessive swaps in Bubble Sort versus shifts in Insertion Sort[cite: 291, 326].
- [cite_start]**Big-O Validation**: Demonstrate the stability of $O(n \log n)$ under large datasets (up to 100,000 elements)[cite: 366].

- [cite_start]**進階排序**：實作快速排序（分治法）並與基礎排序法進行比較 [cite: 335, 341]。
- [cite_start]**效率分析**：量化氣泡排序中過多交換操作與插入排序位移操作之間的效能影響 [cite: 291, 326]。
- [cite_start]**複雜度驗證**：展示 $O(n \log n)$ 在處理大規模資料（達 100,000 筆）時的穩定性 [cite: 366]。

🧮 Complexity Reference | 複雜度參考
- [cite_start]**Quick Sort**: Average $O(n \log n)$, Worst $O(n^2)$[cite: 338, 343].
- [cite_start]**Insertion Sort**: Average/Worst $O(n^2)$[cite: 257, 274].
- [cite_start]**Bubble Sort**: Average/Worst $O(n^2)$[cite: 308, 314].

💻 Implementation Details | 實作細節
- **Language**: Java 11+
- [cite_start]**Source Code**: No built-in packages used for sorting[cite: 71, 87].
- **Metric**: Execution time measured in milliseconds (ms).

📊 Experimental Results | 實驗結果

| Data Size ($n$) | Quick Sort | Insertion Sort | Bubble Sort |
| :--- | :--- | :--- | :--- |
| 1,000 | 0 ms | 2 ms | 2 ms |
| 10,000 | 2 ms | 18 ms | 76 ms |
| 50,000 | 2 ms | 427 ms | 2343 ms |
| 100,000 | 5 ms | 1698 ms | 9680 ms |

> **Analysis**: While both Insertion and Bubble Sort are $O(n^2)$, **Bubble Sort** takes nearly 5.7x more time at $n=100,000$ due to heavy swapping costs. [cite_start]**Quick Sort** remains extremely fast (5 ms) even at the largest scale[cite: 366].
> [cite_start]**分析**：雖然插入排序與氣泡排序皆為 $O(n^2)$，但由於大量的交換成本，**氣泡排序**在 $n=100,000$ 時耗時約為插入排序的 5.7 倍。而**快速排序**即使在最大規模下依然極快（僅 5 毫秒） [cite: 366]。

🚀 Usage | 執行方式
1. Clone the repository:
   ```bash
   git clone [https://github.com/tch107146/Algorithm-0304-Assignments-2.git](https://github.com/tch107146/Algorithm-0304-Assignments-2.git)