
class DuplicateElement{

	public static void main(String[] args){

		ArrayImpl iArr = new ArrayImplWithQuicksort(40);

		iArr.randomize();

		System.out.println(iArr.toString());

		iArr.sort();

		System.out.println(iArr.toString());

	}

}