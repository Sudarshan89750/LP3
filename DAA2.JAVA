
import java.util.Arrays;
import java.util.Iterator;

class Job {
	int id;
	int deadLine;
	int profit;

	Job(int id, int deadLine, int profit) {
		this.id = id;
		this.deadLine = deadLine;

		this.profit = profit;

	}
}

class JobSequencing {
	public void Sequencing(Job[] jobs, int maxDeadline) {
		Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
		int[] result = new int[maxDeadline + 1]; // to store result
		Arrays.fill(result, -1);
		int totalProfit = 0;
		int jobCount = 0;

//		 boolean [] slot=new boolean[maxDeadline];
		for (Job job : jobs) {
			for (int j = job.deadLine; j > 0; j--) {
				if (result[j] == -1) {
					result[j] = job.id;
					totalProfit += job.profit;
					jobCount++;
					break;

				}
			}
		}
		System.out.println("Scheduled Jobs\n");
		for (int i = 1; i <= maxDeadline; i++) {
			if (result[i] != -1) {
				System.out.print("Job " + result[i] + " ");
			}
		}
		System.out.println();
		System.out.println("Total profit : " + totalProfit);
		System.out.println("Total jobCount : " + jobCount);

	}
}

public class DAA2 {

	public void name() {

	}

	public static void main(String[] args) {
		Job[] jobs = { new Job(1, 4, 20), new Job(2, 1, 10), new Job(3, 1, 40), new Job(4, 1, 30) };
		int n = jobs.length;
		JobSequencing obj = new JobSequencing();
		obj.Sequencing(jobs, n);
	}
}
