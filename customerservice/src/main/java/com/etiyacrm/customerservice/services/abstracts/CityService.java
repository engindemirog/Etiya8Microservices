package com.etiyacrm.customerservice.services.abstracts;

import com.etiyacrm.customerservice.core.business.paging.PageInfo;
import com.etiyacrm.customerservice.services.dtos.requests.CreateCityRequest;
import com.etiyacrm.customerservice.services.dtos.responses.CreatedCityResponse;
import com.etiyacrm.customerservice.services.dtos.responses.GetAllCityResponse;

import java.util.List;

public interface CityService {
    List<GetAllCityResponse> getAll(PageInfo pageInfo);
    CreatedCityResponse add(CreateCityRequest createCityRequest);
}
