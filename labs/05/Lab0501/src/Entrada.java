import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Entrada {

    private List<Personas> personas;

    public Entrada() {
        personas = new ArrayList<>();
        cargarDesdeArchivo();
    }

    private void cargarDesdeArchivo() {
        try (Scanner scanner = new Scanner(new File("personas.csv"))) {
            while (scanner.hasNextLine()) {
                String[] datosPersonas = scanner.nextLine().split(",");
                Personas temp = new Personas(Integer.parseInt(datosPersonas[0]), datosPersonas[1], datosPersonas[2], datosPersonas[3], datosPersonas[4]);
                personas.add(temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo de municipios: " + e.getMessage());
        }
    }
    
    public int[] personasPorApellidosTodos(){
        int personasApellidos[] = new int [12];
        int i=0;
        while (i<personas.size()){
            Personas temp = personas.get(i);
            
            switch (temp.primerapellido) {
                case ".RODRIGUEZ": personasApellidos[0] += 1;
                                break;
                case ".GARCIA":   personasApellidos[1] += 1;
                                break;
                case ".GOMEZ":  personasApellidos[2] += 1;
                                break;
                case ".RESTREPO":   personasApellidos[3] += 1;
                                    break;
                case ".MORENO":  personasApellidos[4] += 1;
                                break;
                case ".GONZALEZ": personasApellidos[5] += 1;
                                break;
                case ".SANCHEZ":  personasApellidos[6] += 1;
                                break;
                case ".PEREZ":  personasApellidos[7] += 1;
                                break;
                case ".ORTIZ":  personasApellidos[8] += 1;
                                break;
                case ".DIAZ":  personasApellidos[9] += 1;
                                break;
                case ".MARTINEZ":  personasApellidos[10] += 1;
                                break;
                case ".GUERRERO":  personasApellidos[11] += 1;
                                break;                
                default:    break;
            }
            i++;
        }
        return personasApellidos;
    }
    
    public int[] personasPorApellidosNombre() {
        int personasApellidos[] = new int[12];
        int i = 0;
        while (i < personas.size()) {
            Personas temp = personas.get(i);

            if(temp.segundonombre.equals(".")){
                switch (temp.primerapellido) {
                    case ".RODRIGUEZ":
                        personasApellidos[0] += 1;
                        break;
                    case ".GARCIA":
                        personasApellidos[1] += 1;
                        break;
                    case ".GOMEZ":
                        personasApellidos[2] += 1;
                        break;
                    case ".RESTREPO":
                        personasApellidos[3] += 1;
                        break;
                    case ".MORENO":
                        personasApellidos[4] += 1;
                        break;
                    case ".GONZALEZ":
                        personasApellidos[5] += 1;
                        break;
                    case ".SANCHEZ":
                        personasApellidos[6] += 1;
                        break;
                    case ".PEREZ":
                        personasApellidos[7] += 1;
                        break;
                    case ".ORTIZ":
                        personasApellidos[8] += 1;
                        break;
                    case ".DIAZ":
                        personasApellidos[9] += 1;
                        break;
                    case ".MARTINEZ":
                        personasApellidos[10] += 1;
                        break;
                    case ".GUERRERO":
                        personasApellidos[11] += 1;
                        break;
                    default:
                        break;
                }
            }
            i++;
        }
        return personasApellidos;
    }
    
    
}
