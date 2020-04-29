package org.openmrs.module.myfhirmodule;

import java.util.Collection;

import ca.uhn.fhir.rest.annotation.IdParam;
import ca.uhn.fhir.rest.annotation.Read;
import ca.uhn.fhir.rest.server.IResourceProvider;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.hl7.fhir.r4.model.Appointment;
import org.hl7.fhir.r4.model.IdType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("fhirResources")
public class AppointmentResourceProvider implements IResourceProvider {
	
	@Override
	public Class<? extends IBaseResource> getResourceType() {
		return Appointment.class;
	}
	
	@Read
	public Collection<Appointment> getAppointment(@IdParam IdType id) {
		return null;
	}
}
