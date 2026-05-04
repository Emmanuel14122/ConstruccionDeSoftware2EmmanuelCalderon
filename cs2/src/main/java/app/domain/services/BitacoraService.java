package app.domain.services;

import java.time.LocalDateTime;
import java.util.List;

import app.domain.exception.NotFoundException;
import app.domain.models.Bitacora;
import app.domain.ports.BitacoraPort;

/**
 * Servicio de dominio para la consulta de la Bitácora de Operaciones.
 */
public class BitacoraService {

    private final BitacoraPort bitacoraPort;

    public BitacoraService(BitacoraPort bitacoraPort) {
        this.bitacoraPort = bitacoraPort;
    }

    /**
     * Obtiene un registro de bitácora por su ID.
     */
    public Bitacora getById(String idBitacora) {
        return bitacoraPort.findById(idBitacora)
            .orElseThrow(() -> new NotFoundException(
                "Bitacora record " + idBitacora + " not found."));
    }

    /**
     * Obtiene todos los registros de la bitácora relacionados con un producto.
     * Usado por Clientes para ver el historial de sus cuentas/préstamos/transferencias.
     */
    public List<Bitacora> getByProductoAfectado(String idProductoAfectado) {
        return bitacoraPort.findByProductoAfectado(idProductoAfectado);
    }

    /**
     * Obtiene todos los registros generados por un usuario.
     * Acceso del Analista Interno para auditar acciones de un usuario específico.
     */
    public List<Bitacora> getByUser(Long idUser) {
        return bitacoraPort.findByUser(idUser);
    }

    /**
     * Obtiene registros filtrados por tipo de operación.
     */
    public List<Bitacora> getByOperationType(String operationType) {
        return bitacoraPort.findByOperationType(operationType);
    }

    /**
     * Obtiene registros dentro de un rango de fechas.
     * Acceso del Analista Interno para auditorías por período.
     */
    public List<Bitacora> getByDateRange(LocalDateTime from, LocalDateTime to) {
        if (from.isAfter(to)) {
            throw new IllegalArgumentException(
                "Start date cannot be after end date.");
        }
        return bitacoraPort.findByDateRange(from, to);
    }

    /**
     * Obtiene todos los registros de la bitácora.
     * Acceso exclusivo del Analista Interno.
     */
    public List<Bitacora> getAll() {
        return bitacoraPort.findAll();
    }
}
