package com.colsubsidio;

import com.colsubsidio.model.Beneficiario;
import com.colsubsidio.model.ReportePiloto;
import com.colsubsidio.model.ValidadorDerechosResponse;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String rutaArchivo = "/home/nancho/reportePilotoNullNullUltimo.csv";

        LeerListaReportePiloto leerListaReportePiloto = new LeerListaReportePiloto();

        List<ReportePiloto> registros = leerListaReportePiloto.leerArchivo(rutaArchivo);

        ConsultarInformacionValidadorDerechos consultarInformacionValidadorDerechos = new ConsultarInformacionValidadorDerechos();

        for(ReportePiloto reportePiloto: registros){

            ValidadorDerechosResponse response =  consultarInformacionValidadorDerechos.consultarInformacionBeneficiario(reportePiloto.getNumId());

            Beneficiario beneficiario = consultarInformacionValidadorDerechos.obtenerInformacionBeneficiario(response, reportePiloto.getNumId());

            if(beneficiario != null){

                String nombreCompleto = beneficiario.getPrimerNombre() + " "+ beneficiario.getPrimerApellido();

                System.out.println("UPDATE t2_sum_vta_piloto SET nombreCompleto = '"+ nombreCompleto + "' WHERE idVenta = '"+ reportePiloto.getIdVenta()+"'");
            }
            else
            {
                System.out.println("NO_EXISTE - "+reportePiloto.getNumId());
            }
        }
    }
}