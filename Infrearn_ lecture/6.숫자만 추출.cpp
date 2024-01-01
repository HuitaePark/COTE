#include <iostream>
#include <cstring>

using namespace std;

int main() {
	char str[50];
	int num = 0,plus =0;

	cin >> str;
	
	for (int i = 0; i < strlen(str); i++) {
		if (str[i] > 47 && str[i] < 58) {
			num = num * 10 + str[i] - 48;
		}
	}
	for (int i = 1; i <= num; i++) {
		if (num % i == 0) plus++;
	}
	
	cout << num << endl;
	cout << plus;

	return 0;
	
}
