package gov.samhsa.c2s.c2suiapi.service;

import gov.samhsa.c2s.c2suiapi.infrastructure.dto.*;

import java.util.List;

public interface PcmService {
    List<ConsentProviderDto> getProviders(String mrn);

    void saveProviders(String mrn, IdentifiersDto providerIdentifiersDto);

    void deleteProvider(String mrn, Long providerId);

    Object getConsent(String mrn, Long consentId, String format);

    Object getAttestedConsent(String mrn, Long consentId, String format);

    Object getRevokedConsent(String mrn, Long consentId, String format);

    PageableDto<DetailedConsentDto> getConsents(String mrn, Integer page, Integer size);

    void saveConsent(String mrn, ConsentDto consentDto);

    void deleteConsent(String mrn, Long consentId);

    void updateConsent(String mrn, Long consentId, ConsentDto consentDto);

    void attestConsent(String mrn, Long consentId, ConsentAttestationDto consentAttestationDto);

    void revokeConsent(String mrn, Long consentId, ConsentRevocationDto consentRevocationDto);

    List<PurposeDto> getPurposes();

    ConsentTermDto getConsentAttestationTerm(Long id);

    ConsentTermDto getConsentRevocationTerm(Long id);
}