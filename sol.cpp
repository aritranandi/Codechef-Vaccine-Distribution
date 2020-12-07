#include <bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
using namespace std;
using namespace __gnu_pbds;

#define ll long long
#define ar array

typedef tree<int, null_type, less<int>, rb_tree_tag,
tree_order_statistics_node_update> indexed_set;

void solve() {
	int n, d;
	cin >> n >> d;
	int a[n];
	for(int i=0; i<n; ++i)
		cin >> a[i];
	int r=0, nr=0;
	for(int i=0; i<n; ++i) {
		if(a[i]<=9||a[i]>=80)
			r++;
		else
			nr++;
	}
	r=(r%d==0?r/d:r/d+1);
	nr=(nr%d==0?nr/d:nr/d+1);
	cout << r+nr << "\n";
}

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	int t;
	cin >> t;
	while(t--)
		solve();
}
