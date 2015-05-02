public class BinaryPolynomialDivTwo{

  public int countRoots(int P[]) {
  	int sum = 0, r = 0;
    for(int i = 0; i < P.length;i++){
    	sum += P[i];
    }
    if(P[0] == 0)
    	r++;
    if(sum % 2 == 0)
		r++;
    return r;
  }

}
