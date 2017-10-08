public class Living{

	boolean respiration;
	boolean movement;
	boolean excretion;
	boolean reproduction;
	boolean growth;
	boolean reaction;
	boolean responseToStimuli;
	boolean cellComposition;

	public Living(){
		respiration=true;
		movement=true;
		excretion=true;
		reproduction=true;
		growth=true;
		reaction=true;
		responseToStimuli=true;
		cellComposition=true;
	}

	public Living(boolean pRespiration){
		respiration=pRespiration;
		movement=true;
		excretion=true;
		reproduction=true;
		growth=true;
		reaction=true;
		responseToStimuli=true;
		cellComposition=true;
	}

	public Living(Integer... integerArray){

	}
}