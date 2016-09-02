public class Quicksort {
	int[] array ;

	
public void sort(int[] x){
		sort(x,0,x.length-1);
	}

public static void sort(int[] x,int if, int il){

	int pivot = x[(int) Math.random()*(il-if+1)+if];
	int i=if;
	int j=il;
	int aux;

	while (i<j){
		while (x[i]<=pivot && i<j) i++;
		while (x[j]>pivot) j--;
		if (i<j){
			aux=x[i];
			x[i]=x[j];
			x[j]=aux;
		}
	}
	x[if]=x[j];
	x[j]=pivot;
	if (ip<j-1){
		sort(x,if,j-1);
	}
	if(j+1<iu){
		sort(x,j+1,il);
	}
	
}
}
