package com.colsubsidio;

import com.colsubsidio.model.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        generarActualizacionReportePiloto();

        //generarActualizacionBeneficiarios();
    }

    public static void generarActualizacionReportePiloto(){

        String rutaArchivo = "/home/nancho313/t2_sum_vta_piloto_201903221647.csv";

        LeerListaReportePiloto leerListaReportePiloto = new LeerListaReportePiloto();

        List<ReportePiloto> registros = leerListaReportePiloto.leerArchivo(rutaArchivo);

        ConsultarInformacionValidadorDerechos consultarInformacionValidadorDerechos = new ConsultarInformacionValidadorDerechos();

        String time = ""+new Date().getTime();

        File file = new File("/home/nancho313/solucion_calentados/reporte_piloto_"+time+".sql");
        File errors = new File("/home/nancho313/solucion_calentados/errors_"+time+".txt");
        try {

            if(file.createNewFile() && errors.createNewFile()) {

                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                FileWriter fileWriter1 = new FileWriter(errors);
                BufferedWriter bufferedWriter1 = new BufferedWriter(fileWriter1);

                for (ReportePiloto reportePiloto : registros) {

                    ValidadorDerechosLegacyResponse response = consultarInformacionValidadorDerechos.consultarInformacionBeneficiarioLegacy(reportePiloto.getNumId(), reportePiloto.getTipoId());

                    Beneficiario beneficiario = consultarInformacionValidadorDerechos.obtenerInformacionBeneficiario(response, reportePiloto.getNumId());

                    if (beneficiario != null) {

                        String nombreCompleto = beneficiario.getPrimerNombre() + " " + beneficiario.getPrimerApellido();

                        String queryToPrint = "UPDATE t2_sum_vta_piloto SET nombreCompleto = '" + nombreCompleto + "' WHERE idVenta = '" + reportePiloto.getIdVenta() + "';";
                        bufferedWriter.write(queryToPrint);
                        bufferedWriter.write("\n");
                        System.out.println(queryToPrint);

                    } else {

                        System.out.println("NO_EXISTE - " + reportePiloto.getNumId());
                        bufferedWriter1.write("NO_EXISTE - " + reportePiloto.getNumId());
                        bufferedWriter1.write("\n");
                    }
                }

                closeBufferedWriter(bufferedWriter);
                closeBufferedWriter(bufferedWriter1);
                closeFileWriter(fileWriter);
                closeFileWriter(fileWriter1);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void generarActualizacionBeneficiarios(){

        String rutaArchivo = "/home/nancho313/t2_vta_beneficiario_201903211546.csv";

        LeerListaBeneficiarios leerListaBeneficiarios = new LeerListaBeneficiarios();

        List<T2Beneficiario> registros = leerListaBeneficiarios.leerArchivo(rutaArchivo);

        ConsultarInformacionValidadorDerechos consultarInformacionValidadorDerechos = new ConsultarInformacionValidadorDerechos();

        for (T2Beneficiario registro : registros) {

            ValidadorDerechosResponse response = consultarInformacionValidadorDerechos.consultarInformacionBeneficiario(registro.getNumId(), registro.getTipoId());

            Beneficiario beneficiario = consultarInformacionValidadorDerechos.obtenerInformacionBeneficiario(response, registro.getNumId());

            if(beneficiario != null){

                String nombreCompleto = beneficiario.getPrimerNombre() + " "+ beneficiario.getPrimerApellido();

                System.out.println("UPDATE t2_vta_beneficiario SET nombreCompleto = '"+ nombreCompleto + "' WHERE id = '"+ registro.getId()+"';");
            }
            else
            {
                //System.out.println("NO_EXISTE - "+registro.getNumId());
            }
        }
    }

    public static void closeBufferedWriter(BufferedWriter bufferedWriter){

        try {
            bufferedWriter.close();
        } catch (IOException e) {

        }
    }

    public static void closeFileWriter(FileWriter fileWriter){

        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}