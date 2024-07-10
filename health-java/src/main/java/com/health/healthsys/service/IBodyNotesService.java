package com.jyx.healthsys.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jyx.healthsys.entity.BodyNotes;

import java.util.List;


public interface IBodyNotesService extends IService<BodyNotes> {


    boolean insert(BodyNotes bodyNotes);

}
