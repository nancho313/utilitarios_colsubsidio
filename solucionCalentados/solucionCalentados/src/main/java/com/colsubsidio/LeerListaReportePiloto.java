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

                ReportePiloto reportePiloto = new ReportePiloto(infoSplit[0], infoSplit[1]);

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
}
