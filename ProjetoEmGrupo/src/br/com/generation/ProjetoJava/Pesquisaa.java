package br.com.generation.ProjetoJava;

public class Pesquisaa {
	
	//verifica fumar
			private int fumoint;
			private double gastofumo;
			void verificafuma(int _fumoint, double _gastofumo) {
				this.fumoint = _fumoint;
				this.gastofumo = _gastofumo;
				}
			//resposta para quem fuma
					void respostafumo() {
						if(fumoint == 1) {
							malfumo();
					}else if (fumoint == 2) {
						parabensfumo();
					}else {
						System.out.println("Voce digitou uma opcao inv�lida por isso nao fizemos a verificacao(fumo)");
					}
					}
			
			//verifica  beber
			private int latas;
			private int mlsdes;
			private int taca;
			void verificabebe(int _latas, int _mlsdes,int _taca) {	
					//recebendo se a pessoa bebe ou nao
					this.latas = _latas;
					this.mlsdes = _mlsdes;
					this.taca = _taca;		
			}
			//resposta para quem bebe
					void respostabebe() {
						
						if(latas > 1) {
							latas = latas - 1;
							System.out.println("Voce esta bebendo "+ latas + " latas a mais de cerveja, o ideal � tanto...");
						}else if(latas <= 1 && latas >0) {
							System.out.println("voce esta na media do ideal para beber cerveja, mas nao se deixe levar");
						}
						if(mlsdes > 30){
							mlsdes = mlsdes - 30;
							System.out.println("Voce esta bebendo " + mlsdes+ " MLs a mais de destilado, o ideal � tanto...");
						}else if(mlsdes <=30 && mlsdes > 0){
							System.out.println("voce esta na media do ideal para beber destilado, mas nao se deixe levar");
						}
						if(taca > 1) {
							taca = taca-1;
							System.out.println("Voce esta bebendo "+ taca + " Ta�as a mais de vinho,o ideal � tanto...");
						}else if(taca <=1 && taca >0) {
							System.out.println("voce esta na media do ideal para beber vinho, mas nao se deixe levar");
						}
					}
			
					private int horasr;
					private int redetrab;
			//verfica redes
					void verificaedes(int _horasr,int _redetrab) {
						this.horasr = _horasr;
						this.redetrab = _redetrab;
					}
			//resposta redes
					void respostaredes() {
						if(redetrab == 1) {
							if(horasr == 0 ) {
								System.out.println("Feedback Sobre as redes sociais");
								System.out.println("Pelo visto voce n usa redes sociais, os riscos a sua saude portanto nao ha riscos a sua saude em relacao a isso (Redes sociais)");
							}else if(horasr > 1 && horasr < 3) {
								System.out.println("Feedback Sobre as redes sociais");
								System.out.println("Voce esta no tempo ideal de uso, vc nao sera tao prejudicado...");
							}else if(horasr > 3 && horasr <7) {
								System.out.println("Feedback Sobre as redes sociais");
								System.out.println("Voce esta em estado de alerta, tome cuidado, pela quantidade de horas vc pode ser mt prejudicado(redes sociais");
							}else if(horasr>7) {
								int exchorasr = horasr -7;
								System.out.println("Feedback Sobre as redes sociais");
								System.out.println("Tome muito cuidado, voce esta se prejudicando muito e deve seguir as recomendacoes do programa e vc esta " +exchorasr+ " hora acima do ideal (Redes sociais)");
							}
						}else if(redetrab ==2) {
							if(horasr > 3 && horasr <7) {
								System.out.println("Sabemos que voce esta trabalhando, mas vc esta estado de alerta, tome cuidado, pela quantidade de horas vc pode ser mt prejudicado(redes sociais");
							}else if(horasr>7) {
								int exchorasr = horasr -7;
								System.out.println("Feedback Sobre as redes sociais");
								System.out.println("Tome muito cuidado,sabemos que � por causa do trabalho mas voce esta se prejudicando muito e deve seguir as recomendacoes do programa e vc esta " +exchorasr+ " hora acima do ideal (Redes sociais)");
							}
						}else {
							System.out.println("parece q vc digitou uma opcao inv�lida, portanto nao fizemos a verificacao(redes)");
						}
					}
			
			//verifica jogos
			private int horasj;
			private int jogostrab;
				void verificarjogos(int _horasj, int _jogostrab) {
					this.horasj=_horasj;
					this.jogostrab=_jogostrab;
				}
				
				//resposta jogos
				void respostajogos() {
					if(jogostrab == 1) {
						if(horasj == 0) {
							System.out.println("Feedback Sobre jogos");
							System.out.println("parece q vc nao joga, portanto nao tera nenhum risco a saude em relacao a isso");
						}else if(horasj >2 ) {
							int exchorasj = horasj-2;
							System.out.println("Feedback Sobre jogos");
							System.out.println("cuidado, o ideal � 2 horas por dia e vc esta: " + exchorasj+ " a mais");
						}else {
							System.out.println("Feedback Sobre jogos");
							System.out.println("parece que o tempo que vc joga esta na media ideal, continue assim");
						}
					}else if(jogostrab ==2) {
						if(horasj == 0) {
							System.out.println("Feedback Sobre jogos");
							System.out.println("parece q vc nao joga, portanto nao tera nenhum risco a saude em relacao a isso");
						}else if(horasj >2 ) {
							int exchorasj = horasj-2;
							System.out.println("Feedback Sobre jogos");
							System.out.println("Sabemos que voce trabalha com isso, mas cuidado, o ideal � 2 horas por dia e vc esta: " + exchorasj+ " a mais");
						}else {
							System.out.println("Feedback Sobre jogos");
							System.out.println("parece que o tempo que vc joga esta na media ideal mesmo trabalhando com isso, continue assim");
						}
					}else {
						System.out.println("Parece que voce digitou uma opcao inv�lida, portanto fizemos a verificacao(jogos)");
					}
				}
			
			//mal fumo
			void malfumo() {
				System.out.println("Feedback sobre Cigarro");
				System.out.println("� bom repensar aquele cigarro di�rio se voc� quer melhorar o seu sistema imunol�gico. Segundo o INCA, o tabagismo surge como um dos inimigos das defesas do corpo e propicia aos fumantes uma chance bem maior de adoecer quando comparados aos n�o-fumantes. N�o importa sua idade, parar de fumar sempre vale a pena. Parar aumenta a expectativa e a qualidade de vida.\r\n"
						+ "Os benef�cios podem ser percebidos em qualquer faixa et�ria, mas quanto mais cedo o fumante parar, mais sa�de ele ter�, como refor�a o Minist�rio da Sa�de.");
				this.gastofumo = this.gastofumo *365;
				System.out.println("Essa � a quantia por ano gasta em cigarros: " + this.gastofumo);
			}
			void parabensfumo() {
				System.out.println("Feedback sobre cigarro");
				System.out.println("Continue assim, voc� evitar� in�meros riscos a sua sa�de e � importante lembrar que o tabaco causa n�o apenas c�ncer, mas uma s�rie de outras doen�as cr�nicas que tamb�m podem levar � morte, como doen�as cardiovasculares, respirat�rias, enfisemas, bronquite cr�nica.");
			}

			//mal bebe
			
}
