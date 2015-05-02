#include <vector>
#include <list>
#include <map>
#include <set>
#include <deque>
#include <stack>
#include <bitset>
#include <algorithm>
#include <functional>
#include <numeric>
#include <utility>
#include <sstream>
#include <iostream>
#include <iomanip>
#include <cstdio>
#include <cmath>
#include <cstdlib>
#include <ctime>

using namespace std;

class GreaterGameDiv2 {
public:
	int calc(vector <int>, vector <int>);
};

int GreaterGameDiv2::calc(vector <int> snuke, vector <int> sothe) {
	
	int n = snuke.size();
	//sort(snuke.begin(), snuke.end());
	//sort(sothe.rbegin(), sothe.rend());
	int ans = 0;
	for (int i = 0; i < n; ++i)
	{
		ans += (snuke[i] > sothe[i]);
	}
	return ans;
}


double test0() {
	int t0[] = {1,3};
	vector <int> p0(t0, t0+sizeof(t0)/sizeof(int));
	int t1[] = {4,2};
	vector <int> p1(t1, t1+sizeof(t1)/sizeof(int));
	GreaterGameDiv2 * obj = new GreaterGameDiv2();
	clock_t start = clock();
	int my_answer = obj->calc(p0, p1);
	clock_t end = clock();
	delete obj;
	cout <<"Time: " <<(double)(end-start)/CLOCKS_PER_SEC <<" seconds" <<endl;
	int p2 = 1;
	cout <<"Desired answer: " <<endl;
	cout <<"\t" << p2 <<endl;
	cout <<"Your answer: " <<endl;
	cout <<"\t" << my_answer <<endl;
	if (p2 != my_answer) {
		cout <<"DOESN'T MATCH!!!!" <<endl <<endl;
		return -1;
	}
	else {
		cout <<"Match :-)" <<endl <<endl;
		return (double)(end-start)/CLOCKS_PER_SEC;
	}
}
double test1() {
	int t0[] = {1,3,5,7,9};
	vector <int> p0(t0, t0+sizeof(t0)/sizeof(int));
	int t1[] = {2,4,6,8,10};
	vector <int> p1(t1, t1+sizeof(t1)/sizeof(int));
	GreaterGameDiv2 * obj = new GreaterGameDiv2();
	clock_t start = clock();
	int my_answer = obj->calc(p0, p1);
	clock_t end = clock();
	delete obj;
	cout <<"Time: " <<(double)(end-start)/CLOCKS_PER_SEC <<" seconds" <<endl;
	int p2 = 0;
	cout <<"Desired answer: " <<endl;
	cout <<"\t" << p2 <<endl;
	cout <<"Your answer: " <<endl;
	cout <<"\t" << my_answer <<endl;
	if (p2 != my_answer) {
		cout <<"DOESN'T MATCH!!!!" <<endl <<endl;
		return -1;
	}
	else {
		cout <<"Match :-)" <<endl <<endl;
		return (double)(end-start)/CLOCKS_PER_SEC;
	}
}
double test2() {
	int t0[] = {2};
	vector <int> p0(t0, t0+sizeof(t0)/sizeof(int));
	int t1[] = {1};
	vector <int> p1(t1, t1+sizeof(t1)/sizeof(int));
	GreaterGameDiv2 * obj = new GreaterGameDiv2();
	clock_t start = clock();
	int my_answer = obj->calc(p0, p1);
	clock_t end = clock();
	delete obj;
	cout <<"Time: " <<(double)(end-start)/CLOCKS_PER_SEC <<" seconds" <<endl;
	int p2 = 1;
	cout <<"Desired answer: " <<endl;
	cout <<"\t" << p2 <<endl;
	cout <<"Your answer: " <<endl;
	cout <<"\t" << my_answer <<endl;
	if (p2 != my_answer) {
		cout <<"DOESN'T MATCH!!!!" <<endl <<endl;
		return -1;
	}
	else {
		cout <<"Match :-)" <<endl <<endl;
		return (double)(end-start)/CLOCKS_PER_SEC;
	}
}
double test3() {
	int t0[] = {3,5,9,16,14,20,15,17,13,2};
	vector <int> p0(t0, t0+sizeof(t0)/sizeof(int));
	int t1[] = {6,18,1,8,7,10,11,19,12,4};
	vector <int> p1(t1, t1+sizeof(t1)/sizeof(int));
	GreaterGameDiv2 * obj = new GreaterGameDiv2();
	clock_t start = clock();
	int my_answer = obj->calc(p0, p1);
	clock_t end = clock();
	delete obj;
	cout <<"Time: " <<(double)(end-start)/CLOCKS_PER_SEC <<" seconds" <<endl;
	int p2 = 6;
	cout <<"Desired answer: " <<endl;
	cout <<"\t" << p2 <<endl;
	cout <<"Your answer: " <<endl;
	cout <<"\t" << my_answer <<endl;
	if (p2 != my_answer) {
		cout <<"DOESN'T MATCH!!!!" <<endl <<endl;
		return -1;
	}
	else {
		cout <<"Match :-)" <<endl <<endl;
		return (double)(end-start)/CLOCKS_PER_SEC;
	}
}

int main() {
	int time;
	bool errors = false;
	
	time = test0();
	if (time < 0)
		errors = true;
	
	time = test1();
	if (time < 0)
		errors = true;
	
	time = test2();
	if (time < 0)
		errors = true;
	
	time = test3();
	if (time < 0)
		errors = true;
	
	if (!errors)
		cout <<"You're a stud (at least on the example cases)!" <<endl;
	else
		cout <<"Some of the test cases had errors." <<endl;
}

//Powered by [KawigiEdit] 2.0!
