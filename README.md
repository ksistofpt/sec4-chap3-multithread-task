 <h1>Fork/Join Mechanics Implementation</h1>

  <h2>Objective</h2>
  <p>Your task is to implement the fork/join mechanics for an array. You will need to divide the array until you reach a specified threshold. After reaching this threshold, you will sum all the numbers in the array to obtain the total sum.</p>

  <h2>Task Description</h2>
  <p>You are provided with a <strong>TaskForkJoin</strong> class that extends the <code>RecursiveTask&lt;Long&gt;</code> class. In this class, you must override the <code>compute()</code> method, which you need to implement.</p>

  <h2>Important Fields</h2>
  <ul>
      <li><strong>THRESHOLD</strong> - The threshold for array splitting. It is set to 200, and you should not change this value.</li>
      <li><strong>long[] array</strong> - The initial array containing all elements.</li>
      <li><strong>int start</strong> - The start index of the array segment.</li>
      <li><strong>int end</strong> - The end index of the array segment.</li>
  </ul>

  <p>The threshold implies that if you have an array of 1000 elements, you should continue splitting it until each segment has 200 elements or less.</p>

  <h2>Execution</h2>
  <p>In addition, there is a <strong>RunnableTask</strong> class where you will run your program. Here, the array is initialized and executed within a <code>ForkJoinPool</code>. Once the program executes, the result will be output.</p>

  <div class="code-block">
      <strong>Expected Output:</strong><br>
      <code>Sum: 500500</code>
  </div>

  <div class="warning">
      <strong>Warning:</strong> Do not change anything except the <code>compute()</code> method!
  </div>
