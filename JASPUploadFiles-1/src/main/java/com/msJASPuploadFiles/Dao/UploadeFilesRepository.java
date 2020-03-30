package com.msJASPuploadFiles.Dao;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.stereotype.Repository;

import com.msJASPuploadFiles.bean.UploadFile;

@Repository
public interface UploadeFilesRepository extends JpaAttributeConverter<UploadFile, Long> {
	
	}
