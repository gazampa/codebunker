
class DuplicateElement{

	public static void main(String[] args){

		BaseArray iArr = new ArrayImplWithMergesort(40);

		iArr.randomize();

		System.out.println(iArr.toString());

		iArr.sort();

		System.out.println(iArr.toString());

	}

}