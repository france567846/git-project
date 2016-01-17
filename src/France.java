public class France {
	public static void main(String[] args){
		 int mas[]=new int[20];
		 int count = 0;
		 for(int i=0;i<mas.length;i++){
			 mas[i]=(int)((Math.random()*4)-2);
			 System.out.println(mas[i]+ " ");
			 if(mas[i]==0){
				 count++;
			 }
		 } 
		 System.out.println("Количество null " + count);
	}
}
