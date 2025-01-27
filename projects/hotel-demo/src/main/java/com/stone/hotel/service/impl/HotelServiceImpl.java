package com.stone.hotel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stone.hotel.mapper.HotelMapper;
import com.stone.hotel.pojo.Hotel;
import com.stone.hotel.service.IHotelService;
import org.springframework.stereotype.Service;

/**
 * Description:
 * Copyright: Copyright (c) 2025 MVWCHINA All rights Reserved
 * Company: 江苏医视教育科技发展有限公司
 *
 * @author 丁佳男
 * @version 1.0
 * @since 2025-01-07 20:23
 */
@Service
public class HotelServiceImpl extends ServiceImpl<HotelMapper, Hotel> implements IHotelService {
}
