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

class ElectronicPetEasy {
public:
	string isDifficult(int, int, int, int, int, int);
};

string ElectronicPetEasy::isDifficult(int st1, int p1, int t1, int st2, int p2, int t2) {
	
	int lcm = (st1 * st2)/__gcd(st1, st2);
	int s1_last = st1 + (t1 - 1) * p1;
	int s2_last = st2 + (t2 - 1) * p2;
	return (lcm <= s1_last  && lcm <= s2_last) ? "Difficult": "Easy" ;
}


double test0() {
	int p0 = 3;
	int p1 = 3;
	int p2 = 3;
	int p3 = 5;
	int p4 = 2;
	int p5 = 3;
	ElectronicPetEasy * obj = new ElectronicPetEasy();
	clock_t start = clock();
	string my_answer = obj->isDifficult(p0, p1, p2, p3, p4, p5);
	clock_t end = clock();
	delete obj;
	cout <<"Time: " <<(double)(end-start)/CLOCKS_PER_SEC <<" seconds" <<endl;
	string p6 = "Difficult";
	cout <<"Desired answer: " <<endl;
	cout <<"\t\"" << p6 <<"\"" <<endl;
	cout <<"Your answer: " <<endl;
	cout <<"\t\"" << my_answer<<"\"" <<endl;
	if (p6 != my_answer) {
		cout <<"DOESN'T MATCH!!!!" <<endl <<endl;
		return -1;
	}
	else {
		cout <<"Match :-)" <<endl <<endl;
		return (double)(end-start)/CLOCKS_PER_SEC;
	}
}
double test1() {
	int p0 = 3;
	int p1 = 3;
	int p2 = 3;
	int p3 = 5;
	int p4 = 2;
	int p5 = 2;
	ElectronicPetEasy * obj = new ElectronicPetEasy();
	clock_t start = clock();
	string my_answer = obj->isDifficult(p0, p1, p2, p3, p4, p5);
	clock_t end = clock();
	delete obj;
	cout <<"Time: " <<(double)(end-start)/CLOCKS_PER_SEC <<" seconds" <<endl;
	string p6 = "Easy";
	cout <<"Desired answer: " <<endl;
	cout <<"\t\"" << p6 <<"\"" <<endl;
	cout <<"Your answer: " <<endl;
	cout <<"\t\"" << my_answer<<"\"" <<endl;
	if (p6 != my_answer) {
		cout <<"DOESN'T MATCH!!!!" <<endl <<endl;
		return -1;
	}
	else {
		cout <<"Match :-)" <<endl <<endl;
		return (double)(end-start)/CLOCKS_PER_SEC;
	}
}
double test2() {
	int p0 = 1;
	int p1 = 4;
	int p2 = 7;
	int p3 = 1;
	int p4 = 4;
	int p5 = 7;
	ElectronicPetEasy * obj = new ElectronicPetEasy();
	clock_t start = clock();
	string my_answer = obj->isDifficult(p0, p1, p2, p3, p4, p5);
	clock_t end = clock();
	delete obj;
	cout <<"Time: " <<(double)(end-start)/CLOCKS_PER_SEC <<" seconds" <<endl;
	string p6 = "Difficult";
	cout <<"Desired answer: " <<endl;
	cout <<"\t\"" << p6 <<"\"" <<endl;
	cout <<"Your answer: " <<endl;
	cout <<"\t\"" << my_answer<<"\"" <<endl;
	if (p6 != my_answer) {
		cout <<"DOESN'T MATCH!!!!" <<endl <<endl;
		return -1;
	}
	else {
		cout <<"Match :-)" <<endl <<endl;
		return (double)(end-start)/CLOCKS_PER_SEC;
	}
}
double test3() {
	int p0 = 1;
	int p1 = 1000;
	int p2 = 1000;
	int p3 = 2;
	int p4 = 1000;
	int p5 = 1000;
	ElectronicPetEasy * obj = new ElectronicPetEasy();
	clock_t start = clock();
	string my_answer = obj->isDifficult(p0, p1, p2, p3, p4, p5);
	clock_t end = clock();
	delete obj;
	cout <<"Time: " <<(double)(end-start)/CLOCKS_PER_SEC <<" seconds" <<endl;
	string p6 = "Easy";
	cout <<"Desired answer: " <<endl;
	cout <<"\t\"" << p6 <<"\"" <<endl;
	cout <<"Your answer: " <<endl;
	cout <<"\t\"" << my_answer<<"\"" <<endl;
	if (p6 != my_answer) {
		cout <<"DOESN'T MATCH!!!!" <<endl <<endl;
		return -1;
	}
	else {
		cout <<"Match :-)" <<endl <<endl;
		return (double)(end-start)/CLOCKS_PER_SEC;
	}
}
double test4() {
	int p0 = 1;
	int p1 = 1;
	int p2 = 1;
	int p3 = 2;
	int p4 = 2;
	int p5 = 2;
	ElectronicPetEasy * obj = new ElectronicPetEasy();
	clock_t start = clock();
	string my_answer = obj->isDifficult(p0, p1, p2, p3, p4, p5);
	clock_t end = clock();
	delete obj;
	cout <<"Time: " <<(double)(end-start)/CLOCKS_PER_SEC <<" seconds" <<endl;
	string p6 = "Easy";
	cout <<"Desired answer: " <<endl;
	cout <<"\t\"" << p6 <<"\"" <<endl;
	cout <<"Your answer: " <<endl;
	cout <<"\t\"" << my_answer<<"\"" <<endl;
	if (p6 != my_answer) {
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
	
	time = test4();
	if (time < 0)
		errors = true;
	
	if (!errors)
		cout <<"You're a stud (at least on the example cases)!" <<endl;
	else
		cout <<"Some of the test cases had errors." <<endl;
}

//Powered by [KawigiEdit] 2.0!
