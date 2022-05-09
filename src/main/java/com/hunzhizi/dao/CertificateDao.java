package com.hunzhizi.dao;

import com.hunzhizi.domain.Certificate;

import java.util.List;

/**
 * @author 魂之子
 * @program: yanChao
 * @create: 2022-05-09 13:17
 * @description:
 */
public interface CertificateDao {
    boolean createCertificate(Certificate certificate);

    boolean delCertificate(Integer certificateId);

    List<Certificate> getAllCertificate();
}
