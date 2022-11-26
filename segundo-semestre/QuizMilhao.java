/* O professor Silveirinha do ensino fundamental, resolveu fazer uma atividade diferenciada, ele deseja montar um Quiz, com 3 ou mais questões, sendo algumas utilizando a conversão de letras para binários e hexadecimais, para seus alunos. O mesmo deseja que o Quiz tenha pegadinhas, para que não seja tão simples.
  Elabore o Quiz para o professor Silveirinha de acordo com o solicitado. 
  Elabora um questionário com 3 perguntas, sobre conhecimentos variados.
	Pontos importantes:
	Para realizar o questionário, é necessário que o usuário insira, nome, idade e local. Sendo somente o nome obrigatório:
- No campo do nome, é utilizado somente o primeiro nome, então não são aceito caracteres além de letras;
- No campo da idade, não são aceitos caracteres além de números;
- No campo do local. não são aceito caracteres além de letras e espaço; 

 E para esse exercicio e necessário utilizar o tratamento de exceções para esses dados*/
package main;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuizMilhao {

	public static Scanner entrada = new Scanner(System.in);
	public static String nome;

	public QuizMilhao() {
	}

	public static void main(String[] args) {
		
			cadastro();
			apresentacao();
			pergunta1();
			pergunta2();
			pergunta3();
			pergunta4();
			encerramento();

	}

	private static void cadastro() {
		String perguntaNome = "Digite o seu primeiro nome:";
		String perguntaIdade = "Bem vindo %s, quantos anos você tem?";
		String perguntaLocal = "Caraca %s, você está ficando velho(a), onde você mora?";
		String fimPerguntas = "Longe para caçamba.";

		String idadeInvalida = "Sua idade foi inserida errada, mas eu entendo você querer escondê-la.";
		String localInvalido = "O local parece errado mas a gente releva.";

		System.out.println(perguntaNome);
		String nomeRecebido;
		while (true) {
			nomeRecebido = entrada.nextLine().toUpperCase();
			try {
				checarNomeValido(nomeRecebido);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		nome = nomeRecebido;

		System.out.println(String.format(perguntaIdade, nome));
		String idade = entrada.nextLine();
		try {
			checarIdadeValida(idade);
		} catch (NumberFormatException e) {
			System.out.println(idadeInvalida);
		}

		System.out.println(String.format(perguntaLocal, nome));
		String local = entrada.nextLine();
		try {
			checarLocalValido(local);
		} catch (Exception e) {
			System.out.println(localInvalido);
		}

		System.out.println(fimPerguntas);
	}

	private static void checarNomeValido(String nomeAValidar) throws Exception {
		String nomeInvalido = "Não sabia que seu nome podia ser tão estranho, escolha uma versão legível do seu nome.";
		String nomeVazio = "Parece que alguém está fugindo da polícia...";
		String nomeComEspaco = "Sabe ler não? É só o primeiro nome!";

		if (nomeAValidar.isEmpty()) {
			throw new Exception(nomeVazio);
		}

		if (nomeAValidar.contains(" ")) {
			throw new Exception(nomeComEspaco);
		}

		Pattern padrao = Pattern.compile("[^a-z^A-Z]");
		Matcher matcher = padrao.matcher(nomeAValidar);
		boolean invalido = matcher.find();
		if (invalido) {
			throw new Exception(nomeInvalido);
		}
	}

	private static void checarIdadeValida(String idadeAValidar) throws NumberFormatException {
		Integer.valueOf(idadeAValidar);
	}

	private static void checarLocalValido(String localAValidar) throws Exception {
		String localInvalido = "O local inserido é invalido!";

		Pattern padraoHexa = Pattern.compile("[^a-z^A-Z]");
		Matcher matcher = padraoHexa.matcher(localAValidar);
		boolean invalido = matcher.find();
		if (invalido) {
			throw new Exception(localInvalido);
		}
	}

	private static void apresentacao() {
		String texto = "\nBom...\nAcho que anotei tudo.\nEstá pronto para começar o grande desafio?\n\nVamos lá, seja bem vindo ao Quiz do Milhão!!!\n";

		System.out.println(String.format(texto, nome));
	}

	private static void pergunta1() {
		String pergunta = "\nQual o resultado da fórmula a seguir (35+87)*5?";
		String resposta = "seiscentos e dez";
		String respostaMalFormatada = "\nVocê precisa extender mais seus pensamentos, %d é muito curto!!";
		String respostaErrada = "\nNúmeros não são o resultado certo.";
		String respostaInvalida = "\nSua resposta não está correta.";
		String respostaCerta = "\nAcertou, mas não fez mais do que sua obrigação.";

		while (true) {
			System.out.println(pergunta);
			String respostaObtida = entrada.nextLine();

			if (respostaObtida.toLowerCase().equals(resposta)) {
				System.out.println(respostaCerta);
				return;

			} else {
				try {
					Integer resultado = Integer.valueOf(respostaObtida);

					if (resultado.equals(610))
						System.out.println(String.format(respostaMalFormatada, resultado));
					else
						System.out.println(respostaErrada);

				} catch (Exception e) {
					System.out.println(respostaInvalida);
				}
			}
		}
	}

	private static void pergunta2() {
		String pergunta = "\nDiga \"oi\" ao robozinho!\n\n" + "     \\. ---- ./\n" + "    - | 0  0 | -\n"
				+ "     +-[ == ]-+\n" + "        d  b";
		String robozinhoEsperando = "\n     \\. ---- ./\n" + "    - | 0  0 | -\n" + "     +-[ == ]-+\n"
				+ "        d  b	o robozinho segue esperando seu cumprimento...";
		String resposta = "0100111101101001";
		String respostaInvalida = "\nNão seja equivocado, ele não entendeu seu código de fala!";
		String respostaCerta = "\n" + "     \\. ---- ./\n" + "    - | ^ 3 ^| -  bigado\n" + "     +-[ == ]-+\n"
				+ "        d  b";

		System.out.println(pergunta);

		while (true) {
			String respostaObtida = entrada.nextLine();

			if (respostaObtida.replaceAll(" ", "").equals(resposta)) {
				System.out.println(respostaCerta);
				return;

			} else {
				try {
					Pattern padraoBinario = Pattern.compile("[^1^0]");
					Matcher matcher = padraoBinario.matcher(respostaObtida);
					boolean invalido = matcher.find();
					if (invalido) {
						System.out.println(respostaInvalida);
					}

				} catch (Exception e) {
					System.out.println(respostaInvalida);
				} finally {
					System.out.println(robozinhoEsperando);
				}
			}
		}
	}

	private static void pergunta3() {
		String pergunta = "\nQue esporte o Neymar joga?";
		String resposta = "66757465626f6c";
		String respostaInvalida = "\nPense bem!!! o que o Brasil vai ser depois da copa deste ano?";
		String respostaHexaErrada = "\nAlgo parece certo, mas não tanto.";
		String respostaCerta = "\nVAI BRASIL!!! ESSE ANO VAI!!!";

		while (true) {
			System.out.println(pergunta);
			String respostaObtida = entrada.nextLine();

			if (respostaObtida.toLowerCase().equals(resposta)) {
				System.out.println(respostaCerta);
				return;

			} else {
				Pattern padraoHexa = Pattern.compile("[^0-9^a-f]");
				Matcher matcher = padraoHexa.matcher(respostaObtida);
				boolean invalido = matcher.find();
				if (invalido) {
					System.out.println(respostaInvalida);
				} else {
					System.out.println(respostaHexaErrada);
				}
			}
		}
	}

	private static void pergunta4() {
		String pergunta = "\nQual a princesa da Disney tem o príncipe mais bonito?\n\n1) Cinderela\n2) Mulan\n3) Anna";
		String resposta = "rapunzel";
		String respostaMalFormatada = "\nTá com preguiça de digitar?";
		String respostaCerta = "\nSe você não concorda, o problema é seu, o quiz é meu.";
		String dica = "\nQual a princesa da Disney tem o príncipe mais bonito?\nDica: Seja humilde, leve somente seu camaleão e sua frigideira!\n\n1) Cinderela\n2) Mulan\n3) Anna";
		Integer tentativasAteDica = 3;

		while (true) {
			if (tentativasAteDica-- > 0)
				System.out.println(pergunta);
			else
				System.out.println(dica);
			String respostaObtida = entrada.nextLine();

			if (respostaObtida.toLowerCase().equals(resposta)) {
				System.out.println(respostaCerta);
				return;

			} else {
				Pattern padraoNumero = Pattern.compile("[0-9]");
				Matcher matcher = padraoNumero.matcher(respostaObtida);
				boolean invalido = matcher.find();
				if (invalido) {
					System.out.println(respostaMalFormatada);
				}
			}
		}
	}

	private static void encerramento() {
		String textoEsperando = "Aperte ENTER para receber seu milhão...";
		String carregando = "Carregando dados bancários, aguarde";
		String textoEncerramento = "\nPARABÉNS %s!!! AQUI ESTÁ SEU MILHÃO:\n" + "⠀  ⡠⡤⢤⣀\r\n" + "⠀⠀⠀⢿⡢⣁⢄⢫⡲⢤⡀⠀⠀⠀⠀⢀⠄\r\n"
				+ "⠀⠀⠀⠘⣧⡁⢔⢑⢄⠙⣬⠳⢄⠀⠀⣾⡀\r\n" + "⠀⠀⠀⠀⠘⢎⣤⠑⣤⠛⢄⠝⠃⡙⢦⣸⣧⡀⠀⢠\r\n" + "⠀⠀⠀⠀⠀⠈⢧⡿⣀⠷⣁⠱⢎⠉⣦⡛⢿⣷⣤⣯\r\n"
				+ "⠀⠀⠈⠉⠛⠻⢶⣵⣎⣢⡜⠣⣠⠛⢄⣜⣳⣿⣿⣿⡄\r\n" + "⠀⠀⠀⠀⠀⠀⠀⠈⠻⢿⣿⣾⣿⣾⣿⣿⣿⣿⣿⣿⣷⣄\r\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷\r\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⠟⠛⠛⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⡇\r\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠋⠀⠀⠀⠀⠀⠙⠿⣿⣿⣿⣿⣿⣿⣿⠂\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⠿⠋⠁";

		System.out.println(textoEsperando);
		entrada.nextLine();
		try {
			System.out.print(carregando);
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.println(".");
			Thread.sleep(1000);

			for (char c : String.format(textoEncerramento, nome).toCharArray()) {
				System.out.print(c);
				Thread.sleep(50);
			}
			System.out.println();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}