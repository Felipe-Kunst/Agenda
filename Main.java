import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Evento");
            System.out.println("2. Editar Evento");
            System.out.println("3. Remover Evento");
            System.out.println("4. Listar Todos os Eventos");
            System.out.println("5. Buscar Eventos");
            System.out.println("6. Contar Eventos em um Ano");
            System.out.println("7. fazer desenho");
            System.out.println("8. Limpar Agenda");
            System.out.println("9. listar datas vazia");
            System.out.println("10. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); 

            switch (escolha) {
                case 1:
                    System.out.print("Digite o dia: ");
                    int dia = scanner.nextInt();
                    System.out.print("Digite o mês: ");
                    int mes = scanner.nextInt();
                    System.out.print("Digite o ano: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Digite o nome do evento: ");
                    String nomeEvento = scanner.nextLine();
                    System.out.print("Digite a descrição do evento: ");
                    String descricaoEvento = scanner.nextLine();
                    agenda.adicionarEvento(dia, mes, ano, new Evento(nomeEvento, descricaoEvento));
                    System.out.println("Evento adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o dia: ");
                    dia = scanner.nextInt();
                    System.out.print("Digite o mês: ");
                    mes = scanner.nextInt();
                    System.out.print("Digite o ano: ");
                    ano = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Digite o nome do evento antigo: ");
                    String nomeEventoAntigo = scanner.nextLine();
                    System.out.print("Digite a descrição do evento antigo: ");
                    String descricaoEventoAntigo = scanner.nextLine();
                    System.out.print("Digite o nome do novo evento: ");
                    String nomeEventoNovo = scanner.nextLine();
                    System.out.print("Digite a descrição do novo evento: ");
                    String descricaoEventoNovo = scanner.nextLine();
                    agenda.editarEvento(dia, mes, ano, new Evento(nomeEventoAntigo, descricaoEventoAntigo), new Evento(nomeEventoNovo, descricaoEventoNovo));
                    System.out.println("Evento editado com sucesso!");
                    break;
                case 3:
                    System.out.print("Digite o dia: ");
                    dia = scanner.nextInt();
                    System.out.print("Digite o mês: ");
                    mes = scanner.nextInt();
                    System.out.print("Digite o ano: ");
                    ano = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o nome do evento: ");
                    nomeEvento = scanner.nextLine();
                    System.out.print("Digite a descrição do evento: ");
                    descricaoEvento = scanner.nextLine();
                    agenda.removerEvento(dia, mes, ano, new Evento(nomeEvento, descricaoEvento));
                    System.out.println("Evento removido com sucesso!");
                    break;
                case 4:
                    System.out.println("\nTodos os eventos:");
                    List<String> todosEventos = agenda.listarTodosEventos();
                    for (String evento : todosEventos) {
                        System.out.println(evento);
                    }
                    break;
                case 5:
                    System.out.print("Digite o dia: ");
                    dia = scanner.nextInt();
                    System.out.print("Digite o mês: ");
                    mes = scanner.nextInt();
                    System.out.print("Digite o ano: ");
                    ano = scanner.nextInt();
                    System.out.println("\nEventos em " + dia + "/" + mes + "/" + ano + ":");
                    List<String> eventosEncontrados = agenda.buscarEventos(dia, mes, ano);
                    for (String evento : eventosEncontrados) {
                        System.out.println(evento);
                    }
                    break;
                case 6:
                    System.out.print("Digite o ano: ");
                    ano = scanner.nextInt();
                    int count = agenda.contarEventosAno(ano);
                    System.out.println("Número de eventos em " + ano + ": " + count);
                    break;
                case 7:
                    System.out.println("\nEstrutura da Agenda:");
                    agenda.desenho();
                    break;
                case 8:
                    agenda.limparAgenda();
                    System.out.println("Agenda limpa com sucesso!");
                    break;
                case 9:
            	   System.out.println("\nDatas vazias:");
                   List<String> datasVazias = agenda.listarDatasVazias();
                   for (String data : datasVazias) {
                       System.out.println(data);
                   }
                   break;
                	
                   
                case 10:
                	 System.out.println("Saindo...");
                     scanner.close();
                     return;
                	
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}
