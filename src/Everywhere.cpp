#include <iostream>
#include <set>
using namespace std;

int main() {
	int T, n;
	set<string> cities;
	string city;

	cin >> T;
	while (T--) {
		cin >> n;
		while(n--) {
			cin >> city;
			cities.insert(city);
		}
		cout << cities.size() << endl;
		cities.clear();
	}
	return 0;

}