package com.zhanghp.generate.model.converter;

import com.zhanghp.generate.dao.entity.Label;
import com.zhanghp.generate.model.ro.LabelRO;
import com.zhanghp.generate.model.vo.LabelVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-01T10:16:06+0800",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_141 (Oracle Corporation)"
)
public class LabelConverterImpl implements LabelConverter {

    @Override
    public LabelVO toVO(Label po) {
        if ( po == null ) {
            return null;
        }

        LabelVO labelVO = new LabelVO();

        labelVO.setId( po.getId() );
        labelVO.setName( po.getName() );
        labelVO.setSort( po.getSort() );

        return labelVO;
    }

    @Override
    public List<LabelVO> toVO(List<Label> poList) {
        if ( poList == null ) {
            return null;
        }

        List<LabelVO> list = new ArrayList<LabelVO>( poList.size() );
        for ( Label label : poList ) {
            list.add( toVO( label ) );
        }

        return list;
    }

    @Override
    public Label changeRO(LabelRO ro) {
        if ( ro == null ) {
            return null;
        }

        Label label = new Label();

        label.setId( ro.getId() );
        label.setName( ro.getName() );
        label.setSort( ro.getSort() );

        return label;
    }

    @Override
    public List<Label> changeRO(List<LabelRO> roList) {
        if ( roList == null ) {
            return null;
        }

        List<Label> list = new ArrayList<Label>( roList.size() );
        for ( LabelRO labelRO : roList ) {
            list.add( changeRO( labelRO ) );
        }

        return list;
    }
}
