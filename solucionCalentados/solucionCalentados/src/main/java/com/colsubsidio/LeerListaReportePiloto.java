package com.colsubsidio;

import com.colsubsidio.model.ReportePiloto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LeerListaReportePiloto {

    public List<ReportePiloto> leerArchivo(String archivo){

        List<ReportePiloto> registros = new ArrayList<>();
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(archivo);

            bufferedReader = new BufferedReader(fileReader);

            String linea = bufferedReader.readLine();

            while(linea != null){

                String[] infoSplit = linea.split(";");

                ReportePiloto reportePiloto = new ReportePiloto(infoSplit[0], infoSplit[1], infoSplit[2]);

                reportePiloto.setTipoId(obtenerTipoDocumento(reportePiloto.getTipoId()));

                registros.add(reportePiloto);

                linea = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(fileReader != null){

                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return registros;
    }

    private String obtenerTipoDocumento(String type){

        String resultado = "99";

        switch (type){

            case "1":
                resultado = "CO1C";
                break;

            case "8":
                resultado = "CO1D";
                break;

            case "4":
                resultado = "CO1E";
                break;

            case "3":
                resultado = "CO1L";
                break;

            case "7":
                resultado = "CO1N";
                break;

            case "6":
                resultado = "CO1P";
                break;

            case "96":
                resultado = "CO1R";
                break;

            case "95":
                resultado = "CO1S";
                break;

            case "2":
                resultado = "CO1T";
                break;

            case "94":
                resultado = "CO1V";
                break;

            case "93":
                resultado = "CO1X";
                break;
        }

        return resultado;
    }
}
