import { TestBed } from '@angular/core/testing';

import { OfferPriceService } from './offer-price.service';

describe('OfferPriceService', () => {
  let service: OfferPriceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(OfferPriceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
