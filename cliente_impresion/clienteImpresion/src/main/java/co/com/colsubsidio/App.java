package co.com.colsubsidio;

import com.infinitec.taquillav2.out.ws.canales.impresion.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        CanalesImpresionReq request = new CanalesImpresionReq();

        request.setCodDetalleVenta(null);

        request.setCodInfoVenta("BOG-14421372");

        request.setNumFactura(null);

        MensajeBaseDTO mensajeBaseDTO = new MensajeBaseDTO();

        mensajeBaseDTO.setCanal((short) '1');

        mensajeBaseDTO.setHost("1");

        mensajeBaseDTO.setIdentificadorProceso("1");

        mensajeBaseDTO.setNombreOperacion("1");

        mensajeBaseDTO.setOrigenCliente("1");

        mensajeBaseDTO.setUsuario("1");

        mensajeBaseDTO.setVersion("1");

        request.setMensajeBaseDTO(mensajeBaseDTO);

        CanalesImpresionInImpService canalesImpresionInImpService = new CanalesImpresionInImpService();

        CanalesImpresionResp respuesta = canalesImpresionInImpService.getCanalesImpresionInPort().canalesImpresionSync(request);

        if(respuesta.getCanalesImpresionItemResp() != null){

            for(CanalesImpresionItemResp resp : respuesta.getCanalesImpresionItemResp()){

                if(resp.getFacturaPdfBytes() != null){

                    imprimirArchivoPorBytes(resp.getFacturaPdfBytes());
                }

                Thread.sleep(1000);

                if(resp.getManillaPdfBytes() != null){

                    imprimirArchivoPorBytes(resp.getManillaPdfBytes());
                }
            }
        }

        Thread.sleep(1000);

        imprimirArchivoPorBytes(respuesta.getReciboPdfBytes());

        System.out.println("Respuesta -> "+respuesta);

    }

    private static void imprimirArchivoPorBytes(byte[] data) throws IOException {

        String filename = "/home/nancho313/taquilla_prints/archivo_"+new Date().getTime()+".pdf";

        File file = new File(filename);

        file.createNewFile();

        FileOutputStream outputStream = new FileOutputStream(file);

        outputStream.write(data);

        outputStream.flush();

        outputStream.close();

        System.out.println("Archivo creado !!! -> "+filename);
    }
}
