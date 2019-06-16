package com.treinamento.rest.service;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.jboss.logging.Logger;
import com.treinamento.rest.facade.ApiFacade;
import com.treinamento.rest.type.ApiType;

@Path("/api")
@Named
public class ApiResource {
	Logger LOG = Logger.getLogger(ApiResource.class);

	@Inject
	private ApiFacade apiFacade;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ApiType api() {
		LOG.info("request in API");
		return apiFacade.getApi();

	}
}
