/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.wacodis.metadataconnector.inspect;

import de.wacodis.metadataconnector.model.AbstractDataEnvelope;
import de.wacodis.metadataconnector.model.CopernicusDataEnvelope;

/**
 * MetadataUpdater for {@link CopernicusDataEnvelope} instances
 *
 * @author <a href="mailto:s.drost@52north.org">Sebastian Drost</a>
 */
public class CopernicusMetadataUpdater extends AbstractMetadataUpdater<CopernicusDataEnvelope> {

    @Override
    public boolean supportsDataEnvelope(AbstractDataEnvelope dataEnvelope) {
        return dataEnvelope instanceof CopernicusDataEnvelope;
    }

    @Override
    public AbstractDataEnvelope updateDataEnvelope(CopernicusDataEnvelope existingDataEnvelope, CopernicusDataEnvelope newDataEnvelope) {
        return existingDataEnvelope;
    }

}
