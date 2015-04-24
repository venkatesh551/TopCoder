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

class BracketExpressions {
public:
	string ifPossible(string);
};

string BracketExpressions::ifPossible(string s) {

	int n = s.size();
	if ((n & 1) == 1)
	{
		return "impossible";
	}
	stack<char> t;
	for (int i = 0; i < n; ++i)
	{
		if (s[i] == '(' || s[i] == '{' || s[i] == '[' || s[i] == 'X')
		{
			t.push(s[i]);
		}
		else
		{
			if (t.empty())
			{
				return "impossible";
			} 
			else if (t.top() == '[' && s[i] == ']')
			{
				t.pop();
			}
			else if (t.top() == '{' && s[i] == '}')
			{
				t.pop();
			}
			else if (t.top() == '(' && s[i] == ')')
			{
				t.pop();
			}
			else
			{
				t.push(s[i]);
			}			
		}
	}
	int p = t.size();
	if (p % 2 != 0)
	{
		return "impossible";
	}
	int cnt = 0;
	while (!t.empty())
	{
		if (t.top() == 'X')
		{
			cnt++;
		}
		else
		{
			cnt--;
		}
		if (cnt < 0)
			return "impossible";
		t.pop();
	}
	
	return "possible";
}

//Powered by [KawigiEdit] 2.0!
