import java.io.*;
import java.util.*;

public class Main {
	static final Reader in = new Reader();
	static final PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		int t=in.nextInt();
		for(int i=1; i<=t; ++i)
			new Solver();
		out.close();
	}
	
	static class Solver {
		Solver() {
			int n=in.nextInt(), d=in.nextInt();
			int a[] = new int[n];
			for(int i=0; i<n; ++i)
				a[i]=in.nextInt();
			int r=0, nr=0;
			for(int i=0; i<n; ++i) {
				if(a[i]<=9||a[i]>=80)
					r++;
				else
					nr++;
			}
			r=(r%d==0?r/d:r/d+1);
			nr=(nr%d==0?nr/d:nr/d+1);
			out.println(r+nr);
		}
	}
	
	static class Reader {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String next() {
			while(st==null||!st.hasMoreTokens()) {
				try {
					st=new StringTokenizer(in.readLine());
				} catch(Exception e) {}
			}	
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
