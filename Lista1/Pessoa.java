import java.time.LocalDate;

public class Pessoa {
	
	    private String nome;
	    private char sexo;
	    private LocalDate dataNasc; 
	    private String estadoCivil;
   
	    public Pessoa(String nome, char sexo, LocalDate dataNasc){
	       
	        this.setNome(nome);
	        this.setSexo(sexo);
	        this.setDataNasc(dataNasc);      
	    }

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public char getSexo() {
			return sexo;
		}

		public void setSexo(char sexo) {
			if(sexo == 'F' || sexo == 'M'){
				this.sexo = sexo;
			}else {
				System.out.println("Caracter invalido!");
			}
		}

		public LocalDate getDataNasc() {
			return dataNasc;
		}

		public void setDataNasc(LocalDate dataNasc) {
			this.dataNasc = dataNasc;
		}

		public String getEstadoCivil() {
			return estadoCivil = "solteiro";
		}

		public void setEstadoCivil(String estadoCivil) {
			this.estadoCivil = estadoCivil;
		}
}
