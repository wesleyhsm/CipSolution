package br.com.fourward.ispbtranslate.repository;

import java.util.Collection;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import br.com.fourward.ispbtranslate.entity.ParticipantEntity;

public interface ParticipantRepository extends JpaRepository<ParticipantEntity, Long> {

	public ParticipantEntity findByBankCodeOrIspb(@Param("bankCode") final String bankCode,
			@Param("ispb") final String ispb);

	public Page<ParticipantEntity> findByIspb(@Param("ispb") final String ispb, final Pageable pageable);

	public Page<ParticipantEntity> findByIspbContaining(@Param("ispb") final String ispb, final Pageable pageable);

	public Page<ParticipantEntity> findByIspbIgnoreCase(@Param("ispb") final String ispb, final Pageable pageable);

	public Page<ParticipantEntity> findByIspbIgnoreCaseContaining(@Param("ispb") final String ispb,
			final Pageable pageable);

	public Page<ParticipantEntity> findByIspbStartsWith(@Param("ispb") final String ispb, final Pageable pageable);

	public Page<ParticipantEntity> findByIspbEndsWith(@Param("ispb") final String ispb, final Pageable pageable);

	public Page<ParticipantEntity> findByIspbIgnoreCaseStartsWith(@Param("ispb") final String ispb,
			final Pageable pageable);

	public Page<ParticipantEntity> findByIspbIgnoreCaseEndsWith(@Param("ispb") final String ispb,
			final Pageable pageable);

	public Page<ParticipantEntity> findByIspbIsNull(@Param("ispb") final String ispb, final Pageable pageable);

	public Page<ParticipantEntity> findByIspbIsNotNull(@Param("ispb") final String ispb, final Pageable pageable);

	public Page<ParticipantEntity> findByIspbNot(@Param("ispb") final String ispb, final Pageable pageable);

	public Page<ParticipantEntity> findByIspbIn(@Param("ispbs") final Collection<String> ispbs,
			final Pageable pageable);

	public Page<ParticipantEntity> findByIspbNotIn(@Param("ispbs") final Collection<String> ispbs,
			final Pageable pageable);

	public Page<ParticipantEntity> findByBankCode(@Param("bankCode") final String bankCode, final Pageable pageable);

	public Page<ParticipantEntity> findByBankCodeContaining(@Param("bankCode") final String bankCode,
			final Pageable pageable);

	public Page<ParticipantEntity> findByBankCodeIgnoreCase(@Param("bankCode") final String bankCode,
			final Pageable pageable);

	public Page<ParticipantEntity> findByBankCodeIgnoreCaseContaining(@Param("bankCode") final String bankCode,
			final Pageable pageable);

	public Page<ParticipantEntity> findByBankCodeStartsWith(@Param("bankCode") final String bankCode,
			final Pageable pageable);

	public Page<ParticipantEntity> findByBankCodeEndsWith(@Param("bankCode") final String bankCode,
			final Pageable pageable);

	public Page<ParticipantEntity> findByBankCodeIgnoreCaseStartsWith(@Param("bankCode") final String bankCode,
			final Pageable pageable);

	public Page<ParticipantEntity> findByBankCodeIgnoreCaseEndsWith(@Param("bankCode") final String bankCode,
			final Pageable pageable);

	public Page<ParticipantEntity> findByBankCodeIsNull(@Param("bankCode") final String bankCode,
			final Pageable pageable);

	public Page<ParticipantEntity> findByBankCodeIsNotNull(@Param("bankCode") final String bankCode,
			final Pageable pageable);

	public Page<ParticipantEntity> findByBankCodeNot(@Param("bankCode") final String bankCode, final Pageable pageable);

	public Page<ParticipantEntity> findByBankCodeIn(@Param("bankCodes") final Collection<String> bankCodes,
			final Pageable pageable);

	public Page<ParticipantEntity> findByBankCodeNotIn(@Param("bankCodes") final Collection<String> bankCodes,
			final Pageable pageable);
}