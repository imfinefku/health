package com.jyx.healthsys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jyx.healthsys.entity.Body;
import com.jyx.healthsys.entity.BodyNotes;
import com.jyx.healthsys.mapper.BodyNotesMapper;
import com.jyx.healthsys.service.IBodyNotesService;
import org.springframework.stereotype.Service;



import java.util.List;

@Service
public class BodyNotesServiceImpl extends ServiceImpl<BodyNotesMapper, BodyNotes> implements IBodyNotesService {

    private IBodyNotesService bodyNotesMapper;

    @Override
    public boolean insert(BodyNotes bodyNotes) {
        this.baseMapper.insert(bodyNotes);
        return true;
    }



}

