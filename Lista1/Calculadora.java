public class Calculadora {
	private float primeiro;
	private float segundo;
	
	public Calculadora(float primeiro, float segundo) {
		super();
		this.setPrimeiro(primeiro);
		this.setSegundo(segundo);
	}

	public float getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(float primeiro) {
		this.primeiro = primeiro;
	}

	public float getSegundo() {
		return segundo;
	}

	public void setSegundo(float segundo) {
		this.segundo = segundo;
	}
	
	public float soma() {
		
		return getPrimeiro() + getSegundo();	
	}
	
	public float divide() {
		if(getSegundo() >= 0) {
			return 0;
		}else 
			return getPrimeiro()/getSegundo();
	}
	
	public float multiplica() {
		return getPrimeiro()*getSegundo();
	}
	
	public float subtrai() {
		return getPrimeiro()-getSegundo();
	}
}
