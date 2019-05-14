/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.wacodis.metadataconnector.http.dataacess;

import de.wacodis.metadataconnector.model.AbstractDataEnvelope;
import java.util.List;

/**
 *
 * @author <a href="mailto:s.drost@52north.org">Sebastian Drost</a>
 */
public interface DataAccessProvider {

    public AbstractDataEnvelope createDataEnvelope(AbstractDataEnvelope dataEnvelope) throws DataAccessRequestException;

    public AbstractDataEnvelope updateDataEnvelope(AbstractDataEnvelope dataEnvelope) throws DataAccessRequestException;

    public List<AbstractDataEnvelope> searchDataEnvelopes(AbstractDataEnvelope dataEnvelope) throws DataAccessRequestException;

}