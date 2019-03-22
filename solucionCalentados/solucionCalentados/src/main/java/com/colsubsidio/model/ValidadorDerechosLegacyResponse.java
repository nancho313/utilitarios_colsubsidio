package com.colsubsidio.model;

import java.io.Serializable;
import java.util.List;

public class ValidadorDerechosLegacyResponse implements Serializable{

    private String estado;

    private String mensaje;

    private List<Data> data;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public  class Data{

        private Afiliado afiliado;

        public Afiliado getAfiliado() {
            return afiliado;
        }

        public void setAfiliado(Afiliado afiliado) {
            this.afiliado = afiliado;
        }
    }

    public class Afiliado{

        private String bp;

        private String numeroDocumento;

        private String tipoDocumento;

        private String primerNombre;

        private String segundoNombre;

        private String primerApellido;

        private String segundoApellido;

        private String fechaNacimiento;

        private String edad;

        private String genero;

        private String estadoCivil;

        private String personasACargo;

        private String nivelEducativo;

        private String telefono;

        private String motivoRetiro;

        private String estado;

        private Direccion direccion;

        private Afiliacion afiliacion;

        private CuotaMonetaria cuotaMonetaria;

        private TarjetaMultiservicios tarjetaMultiservicios;

        private Empleadores empleadores;

        private List<Pac> pacs;

        public Empleadores getEmpleadores() {
            return empleadores;
        }

        public void setEmpleadores(Empleadores empleadores) {
            this.empleadores = empleadores;
        }

        public List<Pac> getPacs() {
            return pacs;
        }

        public void setPacs(List<Pac> pacs) {
            this.pacs = pacs;
        }

        public String getBp() {
            return bp;
        }

        public void setBp(String bp) {
            this.bp = bp;
        }

        public String getNumeroDocumento() {
            return numeroDocumento;
        }

        public void setNumeroDocumento(String numeroDocumento) {
            this.numeroDocumento = numeroDocumento;
        }

        public String getTipoDocumento() {
            return tipoDocumento;
        }

        public void setTipoDocumento(String tipoDocumento) {
            this.tipoDocumento = tipoDocumento;
        }

        public String getPrimerNombre() {
            return primerNombre;
        }

        public void setPrimerNombre(String primerNombre) {
            this.primerNombre = primerNombre;
        }

        public String getSegundoNombre() {
            return segundoNombre;
        }

        public void setSegundoNombre(String segundoNombre) {
            this.segundoNombre = segundoNombre;
        }

        public String getPrimerApellido() {
            return primerApellido;
        }

        public void setPrimerApellido(String primerApellido) {
            this.primerApellido = primerApellido;
        }

        public String getSegundoApellido() {
            return segundoApellido;
        }

        public void setSegundoApellido(String segundoApellido) {
            this.segundoApellido = segundoApellido;
        }

        public String getFechaNacimiento() {
            return fechaNacimiento;
        }

        public void setFechaNacimiento(String fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }

        public String getEdad() {
            return edad;
        }

        public void setEdad(String edad) {
            this.edad = edad;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public String getEstadoCivil() {
            return estadoCivil;
        }

        public void setEstadoCivil(String estadoCivil) {
            this.estadoCivil = estadoCivil;
        }

        public String getPersonasACargo() {
            return personasACargo;
        }

        public void setPersonasACargo(String personasACargo) {
            this.personasACargo = personasACargo;
        }

        public String getNivelEducativo() {
            return nivelEducativo;
        }

        public void setNivelEducativo(String nivelEducativo) {
            this.nivelEducativo = nivelEducativo;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getMotivoRetiro() {
            return motivoRetiro;
        }

        public void setMotivoRetiro(String motivoRetiro) {
            this.motivoRetiro = motivoRetiro;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public Direccion getDireccion() {
            return direccion;
        }

        public void setDireccion(Direccion direccion) {
            this.direccion = direccion;
        }

        public Afiliacion getAfiliacion() {
            return afiliacion;
        }

        public void setAfiliacion(Afiliacion afiliacion) {
            this.afiliacion = afiliacion;
        }

        public CuotaMonetaria getCuotaMonetaria() {
            return cuotaMonetaria;
        }

        public void setCuotaMonetaria(CuotaMonetaria cuotaMonetaria) {
            this.cuotaMonetaria = cuotaMonetaria;
        }

        public TarjetaMultiservicios getTarjetaMultiservicios() {
            return tarjetaMultiservicios;
        }

        public void setTarjetaMultiservicios(TarjetaMultiservicios tarjetaMultiservicios) {
            this.tarjetaMultiservicios = tarjetaMultiservicios;
        }
    }

    public class Direccion{

        private Pais pais;

        private Departamento departamento;

        private Municipio municipio;

        private Localidad localidad;

        private String direccionPrincipal;

        private String direccionSecundaria;

        public Pais getPais() {
            return pais;
        }

        public void setPais(Pais pais) {
            this.pais = pais;
        }

        public Departamento getDepartamento() {
            return departamento;
        }

        public void setDepartamento(Departamento departamento) {
            this.departamento = departamento;
        }

        public Municipio getMunicipio(){
            return municipio;
        }

        public void setMunicipio(Municipio municipio){
            this.municipio=municipio;
        }

        public Localidad getLocalidad() {
            return localidad;
        }

        public void setLocalidad(Localidad localidad) {
            this.localidad = localidad;
        }

        public String getDireccionPrincipal() {
            return direccionPrincipal;
        }

        public void setDireccionPrincipal(String direccionPrincipal) {
            this.direccionPrincipal = direccionPrincipal;
        }

        public String getDireccionSecundaria() {
            return direccionSecundaria;
        }

        public void setDireccionSecundaria(String direccionSecundaria) {
            this.direccionSecundaria = direccionSecundaria;
        }
    }

    public class Pais{

        private String id;

        private String nombre;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }

    public class Departamento{

        private String id;

        private String nombre;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }

    public class Municipio{

        private String id;

        private String nombre;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }

    public class Localidad{

        private String id;

        private String nombre;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }

    public class Afiliacion{

        private String fechaAfiliacion;

        private String categoria;

        private String grupo;

        private String tipoSalario;

        private String salario;

        private String salarioOtros;

        private String fechaRetiro;

        private String tipoCargo;

        private String horasLaboradas;

        private String tipoTrabajador;

        public String getFechaAfiliacion() {
            return fechaAfiliacion;
        }

        public void setFechaAfiliacion(String fechaAfiliacion) {
            this.fechaAfiliacion = fechaAfiliacion;
        }

        public String getCategoria() {
            return categoria;
        }

        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }

        public String getGrupo() {
            return grupo;
        }

        public void setGrupo(String grupo) {
            this.grupo = grupo;
        }

        public String getTipoSalario() {
            return tipoSalario;
        }

        public void setTipoSalario(String tipoSalario) {
            this.tipoSalario = tipoSalario;
        }

        public String getSalario() {
            return salario;
        }

        public void setSalario(String salario) {
            this.salario = salario;
        }

        public String getSalarioOtros() {
            return salarioOtros;
        }

        public void setSalarioOtros(String salarioOtros) {
            this.salarioOtros = salarioOtros;
        }

        public String getFechaRetiro() {
            return fechaRetiro;
        }

        public void setFechaRetiro(String fechaRetiro) {
            this.fechaRetiro = fechaRetiro;
        }

        public String getTipoCargo() {
            return tipoCargo;
        }

        public void setTipoCargo(String tipoCargo) {
            this.tipoCargo = tipoCargo;
        }

        public String getHorasLaboradas() {
            return horasLaboradas;
        }

        public void setHorasLaboradas(String horasLaboradas) {
            this.horasLaboradas = horasLaboradas;
        }

        public String getTipoTrabajador() {
            return tipoTrabajador;
        }

        public void setTipoTrabajador(String tipoTrabajador) {
            this.tipoTrabajador = tipoTrabajador;
        }
    }

    private class CuotaMonetaria{

        private String tieneCuotaMonetaria;

        private String lugarEntrega;

        private String valorUltimoSubsidio;

        private String monto;

        public String getTieneCuotaMonetaria() {
            return tieneCuotaMonetaria;
        }

        public void setTieneCuotaMonetaria(String tieneCuotaMonetaria) {
            this.tieneCuotaMonetaria = tieneCuotaMonetaria;
        }

        public String getLugarEntrega() {
            return lugarEntrega;
        }

        public void setLugarEntrega(String lugarEntrega) {
            this.lugarEntrega = lugarEntrega;
        }

        public String getValorUltimoSubsidio() {
            return valorUltimoSubsidio;
        }

        public void setValorUltimoSubsidio(String valorUltimoSubsidio) {
            this.valorUltimoSubsidio = valorUltimoSubsidio;
        }

        public String getMonto() {
            return monto;
        }

        public void setMonto(String monto) {
            this.monto = monto;
        }
    }

    public class TarjetaMultiservicios{

        private MetodoPago metodoPago;

        private String lote;

        private String numeroTarjeta;

        private String gp;

        private String estado;

        private String fechaEntrega;

        private String estadoEntrega;

        private String fechaExpedicion;

        private String causaCambio;

        private String ultimoMesPagado;

        private String motivoBloqueo;

        public MetodoPago getMetodoPago() {
            return metodoPago;
        }

        public void setMetodoPago(MetodoPago metodoPago) {
            this.metodoPago = metodoPago;
        }

        public String getLote() {
            return lote;
        }

        public void setLote(String lote) {
            this.lote = lote;
        }

        public String getNumeroTarjeta() {
            return numeroTarjeta;
        }

        public void setNumeroTarjeta(String numeroTarjeta) {
            this.numeroTarjeta = numeroTarjeta;
        }

        public String getGp() {
            return gp;
        }

        public void setGp(String gp) {
            this.gp = gp;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public String getFechaEntrega() {
            return fechaEntrega;
        }

        public void setFechaEntrega(String fechaEntrega) {
            this.fechaEntrega = fechaEntrega;
        }

        public String getEstadoEntrega() {
            return estadoEntrega;
        }

        public void setEstadoEntrega(String estadoEntrega) {
            this.estadoEntrega = estadoEntrega;
        }

        public String getFechaExpedicion() {
            return fechaExpedicion;
        }

        public void setFechaExpedicion(String fechaExpedicion) {
            this.fechaExpedicion = fechaExpedicion;
        }

        public String getCausaCambio() {
            return causaCambio;
        }

        public void setCausaCambio(String causaCambio) {
            this.causaCambio = causaCambio;
        }

        public String getUltimoMesPagado() {
            return ultimoMesPagado;
        }

        public void setUltimoMesPagado(String ultimoMesPagado) {
            this.ultimoMesPagado = ultimoMesPagado;
        }

        public String getMotivoBloqueo() {
            return motivoBloqueo;
        }

        public void setMotivoBloqueo(String motivoBloqueo) {
            this.motivoBloqueo = motivoBloqueo;
        }
    }

    private class MetodoPago{

        private String id;

        private String nombre;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }

    public class Empleadores{

        private String empleadoresConcurrentes;

        private List<Compania> companias;

        public String getEmpleadoresConcurrentes() {
            return empleadoresConcurrentes;
        }

        public void setEmpleadoresConcurrentes(String empleadoresConcurrentes) {
            this.empleadoresConcurrentes = empleadoresConcurrentes;
        }

        public List<Compania> getCompanias() {
            return companias;
        }

        public void setCompanias(List<Compania> companias) {
            this.companias = companias;
        }
    }

    public  class Compania{

        private String bp;

        private String tipoDocumento;

        private String numberoDocumento;

        private String nombre;

        private String tipoAportante;

        private String claserAportante;

        private String fechaInicioActividad;

        private String estado;

        private String fechaIngresoAfiliado;

        private String fechaInicioVigencia;

        private String fechaFinVigencia;

        private String salario;

        private String sucursal;

        private String localidad;

        private String empresaPrincipal;

        public String getBp() {
            return bp;
        }

        public void setBp(String bp) {
            this.bp = bp;
        }

        public String getTipoDocumento() {
            return tipoDocumento;
        }

        public void setTipoDocumento(String tipoDocumento) {
            this.tipoDocumento = tipoDocumento;
        }

        public String getNumberoDocumento() {
            return numberoDocumento;
        }

        public void setNumberoDocumento(String numberoDocumento) {
            this.numberoDocumento = numberoDocumento;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTipoAportante() {
            return tipoAportante;
        }

        public void setTipoAportante(String tipoAportante) {
            this.tipoAportante = tipoAportante;
        }

        public String getClaserAportante() {
            return claserAportante;
        }

        public void setClaserAportante(String claserAportante) {
            this.claserAportante = claserAportante;
        }

        public String getFechaInicioActividad() {
            return fechaInicioActividad;
        }

        public void setFechaInicioActividad(String fechaInicioActividad) {
            this.fechaInicioActividad = fechaInicioActividad;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public String getFechaIngresoAfiliado() {
            return fechaIngresoAfiliado;
        }

        public void setFechaIngresoAfiliado(String fechaIngresoAfiliado) {
            this.fechaIngresoAfiliado = fechaIngresoAfiliado;
        }

        public String getFechaInicioVigencia() {
            return fechaInicioVigencia;
        }

        public void setFechaInicioVigencia(String fechaInicioVigencia) {
            this.fechaInicioVigencia = fechaInicioVigencia;
        }

        public String getFechaFinVigencia() {
            return fechaFinVigencia;
        }

        public void setFechaFinVigencia(String fechaFinVigencia) {
            this.fechaFinVigencia = fechaFinVigencia;
        }

        public String getSalario() {
            return salario;
        }

        public void setSalario(String salario) {
            this.salario = salario;
        }

        public String getSucursal() {
            return sucursal;
        }

        public void setSucursal(String sucursal) {
            this.sucursal = sucursal;
        }

        public String getLocalidad() {
            return localidad;
        }

        public void setLocalidad(String localidad) {
            this.localidad = localidad;
        }

        public String getEmpresaPrincipal() {
            return empresaPrincipal;
        }

        public void setEmpresaPrincipal(String empresaPrincipal) {
            this.empresaPrincipal = empresaPrincipal;
        }
    }

    public  class Pac{

        private String bp;

        private String tipoDocumento;

        private String numeroDocumento;

        private String primerNombre;

        private String segundoNombre;

        private String apellido;

        private String segundoApellido;

        private String edad;

        private String genero;

        private String fechaNacimiento;

        private Relacion relacion;

        private String fechaInicioVigencia;

        private String fechaFinVigencia;

        private String fechaRegistroRetiro;

        private String discapacidad;

        private String fechaLimiteComprobanteNutricional;

        private Documentacion documentacion;

        private Tarjeta tarjeta;

        private CuotaMonetariaPac cuotaMonetaria;

        private String nivelEducativo;

        private String estado;

        public String getBp() {
            return bp;
        }

        public void setBp(String bp) {
            this.bp = bp;
        }

        public String getTipoDocumento() {
            return tipoDocumento;
        }

        public void setTipoDocumento(String tipoDocumento) {
            this.tipoDocumento = tipoDocumento;
        }

        public String getNumeroDocumento() {
            return numeroDocumento;
        }

        public void setNumeroDocumento(String numeroDocumento) {
            this.numeroDocumento = numeroDocumento;
        }

        public String getPrimerNombre() {
            return primerNombre;
        }

        public void setPrimerNombre(String primerNombre) {
            this.primerNombre = primerNombre;
        }

        public String getSegundoNombre() {
            return segundoNombre;
        }

        public void setSegundoNombre(String segundoNombre) {
            this.segundoNombre = segundoNombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getSegundoApellido() {
            return segundoApellido;
        }

        public void setSegundoApellido(String segundoApellido) {
            this.segundoApellido = segundoApellido;
        }

        public String getEdad() {
            return edad;
        }

        public void setEdad(String edad) {
            this.edad = edad;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public String getFechaNacimiento() {
            return fechaNacimiento;
        }

        public void setFechaNacimiento(String fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }

        public Relacion getRelacion() {
            return relacion;
        }

        public void setRelacion(Relacion relacion) {
            this.relacion = relacion;
        }

        public String getFechaInicioVigencia() {
            return fechaInicioVigencia;
        }

        public void setFechaInicioVigencia(String fechaInicioVigencia) {
            this.fechaInicioVigencia = fechaInicioVigencia;
        }

        public String getFechaFinVigencia() {
            return fechaFinVigencia;
        }

        public void setFechaFinVigencia(String fechaFinVigencia) {
            this.fechaFinVigencia = fechaFinVigencia;
        }

        public String getFechaRegistroRetiro() {
            return fechaRegistroRetiro;
        }

        public void setFechaRegistroRetiro(String fechaRegistroRetiro) {
            this.fechaRegistroRetiro = fechaRegistroRetiro;
        }

        public String getDiscapacidad() {
            return discapacidad;
        }

        public void setDiscapacidad(String discapacidad) {
            this.discapacidad = discapacidad;
        }

        public String getFechaLimiteComprobanteNutricional() {
            return fechaLimiteComprobanteNutricional;
        }

        public void setFechaLimiteComprobanteNutricional(String fechaLimiteComprobanteNutricional) {
            this.fechaLimiteComprobanteNutricional = fechaLimiteComprobanteNutricional;
        }

        public Documentacion getDocumentacion() {
            return documentacion;
        }

        public void setDocumentacion(Documentacion documentacion) {
            this.documentacion = documentacion;
        }

        public Tarjeta getTarjeta() {
            return tarjeta;
        }

        public void setTarjeta(Tarjeta tarjeta) {
            this.tarjeta = tarjeta;
        }

        public CuotaMonetariaPac getCuotaMonetaria() {
            return cuotaMonetaria;
        }

        public void setCuotaMonetaria(CuotaMonetariaPac cuotaMonetaria) {
            this.cuotaMonetaria = cuotaMonetaria;
        }

        public String getNivelEducativo() {
            return nivelEducativo;
        }

        public void setNivelEducativo(String nivelEducativo) {
            this.nivelEducativo = nivelEducativo;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }
    }

    private class Relacion{

        private String codigo;

        private String descripcion;

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
    }

    public class Documentacion{

        private String motivoBloqueo;

        private String descripcionBloqueo;

        public String getMotivoBloqueo() {
            return motivoBloqueo;
        }

        public void setMotivoBloqueo(String motivoBloqueo) {
            this.motivoBloqueo = motivoBloqueo;
        }

        public String getDescripcionBloqueo() {
            return descripcionBloqueo;
        }

        public void setDescripcionBloqueo(String descripcionBloqueo) {
            this.descripcionBloqueo = descripcionBloqueo;
        }
    }

    public class Tarjeta{

        private String numero;

        private String estado;

        private String lote;

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public String getLote() {
            return lote;
        }

        public void setLote(String lote) {
            this.lote = lote;
        }
    }

    public class CuotaMonetariaPac{

        private String motivoBloqueo;

        private String salario;

        public String getMotivoBloqueo() {
            return motivoBloqueo;
        }

        public void setMotivoBloqueo(String motivoBloqueo) {
            this.motivoBloqueo = motivoBloqueo;
        }

        public String getSalario() {
            return salario;
        }

        public void setSalario(String salario) {
            this.salario = salario;
        }
    }
}
