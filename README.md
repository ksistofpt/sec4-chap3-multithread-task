<h1>Task</h1>
<p>Imagine you're organizing a large charity event and need to tally up all the donations received. You have a list of donation amounts and want to find out the total sum of all donations. To make this task more manageable, you decide to divide the list into smaller chunks and distribute these chunks among your friends to help with the counting. Each friend calculates the total amount for their assigned chunk and reports the result back to you. You then combine all these results to get the final total.</p>

<p>You have a <code>DonationTask</code> class that extends <code>RecursiveTask&lt;Long&gt;</code>. You need to override the <code>compute()</code> method in this class to implement the logic for splitting the donation list and calculating the amounts.</p>

<p>The <code>DonationTask</code> class includes a constant <code>THRESHOLD</code> field set to 200. This threshold specifies the maximum number of donations that a single chunk should contain. Do not change this threshold.</p>

<p>For example, if you start with a list of 1,000 donations, you should break it into chunks of 200 or fewer donations each. Then, calculate the total amount by adding up the results from each chunk.</p>

<h2>Details</h2>
<ul>
  <li><strong>THRESHOLD</strong> - threshold of array splitting</li>
  <li><strong>long[] listDonations</strong> - source array with all donations</li>
  <li><strong>int start</strong> - the beginning of the array</li>
  <li><strong>int end</strong> - end of the array</li>
</ul>

<p>There is also a <code>RunnableTask</code> class where we run the program. This is where we initialize our list and execute it in a <code>ForkJoinPool</code>. After everything is up and running, we display the result.</p>

<p>If you implement the <code>compute()</code> method correctly, you should get the total amount:</p>
<p><strong>Sum: 500500</strong></p>
