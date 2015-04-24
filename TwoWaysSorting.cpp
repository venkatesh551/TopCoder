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

class TwoWaysSorting {
public:
	string sortingMethod(vector <string>);
private:
	bool is_lexicographic(vector <string>);
	bool is_length(vector <string>);
};

bool TwoWaysSorting::is_lexicographic(vector <string> strList)
{
	int sz = strList.size();
	
	for (int i = 1; i < sz; ++i)
	{
		if (strList[i].compare(strList[i-1]) < 0)
		{
			return false;
		}
	}
	return true;
}

bool TwoWaysSorting::is_length(vector <string> strList)
{
	int sz = strList.size();
	
	for (int i = 1; i < sz; ++i)
	{
		if (strList[i].length() < strList[i-1].length())
		{
			return false;
		}
	}
	return true;

}
string TwoWaysSorting::sortingMethod(vector <string> stringList)
{
	
	if (is_lexicographic(stringList) && is_length(stringList))
	{
		return "both";
	}
	else if (is_lexicographic(stringList))
	{
		return "lexicographically";
	}
	else if (is_length(stringList))
	{
		return "lengths";
	}
	else
	{
		return "none";
	}
}


double test0() {
	string t0[] = {"a", "aa", "bbb"};
	vector <string> p0(t0, t0+sizeof(t0)/sizeof(string));
	TwoWaysSorting * obj = new TwoWaysSorting();
	clock_t start = clock();
	string my_answer = obj->sortingMethod(p0);
	clock_t end = clock();
	delete obj;
	cout <<"Time: " <<(double)(end-start)/CLOCKS_PER_SEC <<" seconds" <<endl;
	string p1 = "both";
	cout <<"Desired answer: " <<endl;
	cout <<"\t\"" << p1 <<"\"" <<endl;
	cout <<"Your answer: " <<endl;
	cout <<"\t\"" << my_answer<<"\"" <<endl;
	if (p1 != my_answer) {
		cout <<"DOESN'T MATCH!!!!" <<endl <<endl;
		return -1;
	}
	else {
		cout <<"Match :-)" <<endl <<endl;
		return (double)(end-start)/CLOCKS_PER_SEC;
	}
}
double test1() {
	string t0[] = {"c", "bb", "aaa"};
	vector <string> p0(t0, t0+sizeof(t0)/sizeof(string));
	TwoWaysSorting * obj = new TwoWaysSorting();
	clock_t start = clock();
	string my_answer = obj->sortingMethod(p0);
	clock_t end = clock();
	delete obj;
	cout <<"Time: " <<(double)(end-start)/CLOCKS_PER_SEC <<" seconds" <<endl;
	string p1 = "lengths";
	cout <<"Desired answer: " <<endl;
	cout <<"\t\"" << p1 <<"\"" <<endl;
	cout <<"Your answer: " <<endl;
	cout <<"\t\"" << my_answer<<"\"" <<endl;
	if (p1 != my_answer) {
		cout <<"DOESN'T MATCH!!!!" <<endl <<endl;
		return -1;
	}
	else {
		cout <<"Match :-)" <<endl <<endl;
		return (double)(end-start)/CLOCKS_PER_SEC;
	}
}
double test2() {
	string t0[] = {"etdfgfh", "aio"};
	vector <string> p0(t0, t0+sizeof(t0)/sizeof(string));
	TwoWaysSorting * obj = new TwoWaysSorting();
	clock_t start = clock();
	string my_answer = obj->sortingMethod(p0);
	clock_t end = clock();
	delete obj;
	cout <<"Time: " <<(double)(end-start)/CLOCKS_PER_SEC <<" seconds" <<endl;
	string p1 = "none";
	cout <<"Desired answer: " <<endl;
	cout <<"\t\"" << p1 <<"\"" <<endl;
	cout <<"Your answer: " <<endl;
	cout <<"\t\"" << my_answer<<"\"" <<endl;
	if (p1 != my_answer) {
		cout <<"DOESN'T MATCH!!!!" <<endl <<endl;
		return -1;
	}
	else {
		cout <<"Match :-)" <<endl <<endl;
		return (double)(end-start)/CLOCKS_PER_SEC;
	}
}
double test3() {
	string t0[] = {"aaa", "z"};
	vector <string> p0(t0, t0+sizeof(t0)/sizeof(string));
	TwoWaysSorting * obj = new TwoWaysSorting();
	clock_t start = clock();
	string my_answer = obj->sortingMethod(p0);
	clock_t end = clock();
	delete obj;
	cout <<"Time: " <<(double)(end-start)/CLOCKS_PER_SEC <<" seconds" <<endl;
	string p1 = "lexicographically";
	cout <<"Desired answer: " <<endl;
	cout <<"\t\"" << p1 <<"\"" <<endl;
	cout <<"Your answer: " <<endl;
	cout <<"\t\"" << my_answer<<"\"" <<endl;
	if (p1 != my_answer) {
		cout <<"DOESN'T MATCH!!!!" <<endl <<endl;
		return -1;
	}
	else {
		cout <<"Match :-)" <<endl <<endl;
		return (double)(end-start)/CLOCKS_PER_SEC;
	}
}
double test4() {
	string t0[] = {"z"};
	vector <string> p0(t0, t0+sizeof(t0)/sizeof(string));
	TwoWaysSorting * obj = new TwoWaysSorting();
	clock_t start = clock();
	string my_answer = obj->sortingMethod(p0);
	clock_t end = clock();
	delete obj;
	cout <<"Time: " <<(double)(end-start)/CLOCKS_PER_SEC <<" seconds" <<endl;
	string p1 = "both";
	cout <<"Desired answer: " <<endl;
	cout <<"\t\"" << p1 <<"\"" <<endl;
	cout <<"Your answer: " <<endl;
	cout <<"\t\"" << my_answer<<"\"" <<endl;
	if (p1 != my_answer) {
		cout <<"DOESN'T MATCH!!!!" <<endl <<endl;
		return -1;
	}
	else {
		cout <<"Match :-)" <<endl <<endl;
		return (double)(end-start)/CLOCKS_PER_SEC;
	}
}
double test5() {
	string t0[] = {"abcdef", "bcdef", "cdef", "def", "ef", "f", "topcoder"};
	vector <string> p0(t0, t0+sizeof(t0)/sizeof(string));
	TwoWaysSorting * obj = new TwoWaysSorting();
	clock_t start = clock();
	string my_answer = obj->sortingMethod(p0);
	clock_t end = clock();
	delete obj;
	cout <<"Time: " <<(double)(end-start)/CLOCKS_PER_SEC <<" seconds" <<endl;
	string p1 = "lexicographically";
	cout <<"Desired answer: " <<endl;
	cout <<"\t\"" << p1 <<"\"" <<endl;
	cout <<"Your answer: " <<endl;
	cout <<"\t\"" << my_answer<<"\"" <<endl;
	if (p1 != my_answer) {
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
	
	time = test5();
	if (time < 0)
		errors = true;
	
	if (!errors)
		cout <<"You're a stud (at least on the example cases)!" <<endl;
	else
		cout <<"Some of the test cases had errors." <<endl;
}

//Powered by [KawigiEdit] 2.0!
