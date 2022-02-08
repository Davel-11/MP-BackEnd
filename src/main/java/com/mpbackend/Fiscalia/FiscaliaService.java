package com.mpbackend.Fiscalia;

import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.logging.Logger;

@Service
public class FiscaliaService {

    Logger logger = Logger.getLogger((getClass()).getName());

    private FiscaliaRepo fiscaliaRepo;

    public FiscaliaService(FiscaliaRepo fiscaliaRepo) {
        this.fiscaliaRepo = fiscaliaRepo;
    }

    public Iterable<Fiscalia> getFiscalias() {
        try {
            logger.info("OBTENIENDO FISCALIAS");
            return fiscaliaRepo.findAll();
        } catch (Exception e) {
            logger.severe(("ERROR OBETENIENDO FISCALIAS" + e.getMessage()));
            return null;
        }
    }

    public Optional<Fiscalia> getOneFiscalia(Integer id) {
        try {
            logger.info("OBTENIENDO UNA FISCALIA");
            return fiscaliaRepo.findById(id);
        } catch (Exception e) {
            logger.severe(("ERROR OBETENIENDO UNA FISCALIA" + e.getMessage()));
            return null;
        }
    }

    public Fiscalia addFiscalia(Fiscalia fiscalia) {
        try {
            logger.info("AGREGAR FISCALIA");
            return fiscaliaRepo.save(fiscalia);
        } catch (Exception e) {
            logger.severe(("ERROR AGREGANDO UNA FISCALIA" + e.getMessage()));
            return null;
        }
    }

    public Fiscalia removeFiscalia(Integer fiscaliaId) {
        try {
            logger.info("ELIMINAR FISCALIA");

            Optional<Fiscalia> fiscalia = fiscaliaRepo.findById(fiscaliaId);

            if (fiscalia.isEmpty()) {
                return null;
            } else {
                fiscaliaRepo.deleteById(fiscaliaId);
                return fiscalia.get();
            }

        } catch (Exception e) {
            logger.severe(("ERROR ELIMINANDO FISCALIA" + e.getMessage()));
            return null;
        }
    }
}
