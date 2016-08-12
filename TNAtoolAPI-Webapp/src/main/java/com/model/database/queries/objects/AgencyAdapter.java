/* This program is free software: you can redistribute it and/or
 modify it under the terms of the GNU Lesser General Public License
 as published by the Free Software Foundation, either version 3 of
 the License, or (props, at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>. */

package com.model.database.queries.objects;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.model.database.onebusaway.gtfs.hibernate.objects.ext.AgencyExt;

public class AgencyAdapter extends XmlAdapter<AgencyType, AgencyExt> {

    @Override
    public AgencyExt unmarshal(AgencyType arg) throws Exception {
        if (arg == null) {
            return null;
        }
        AgencyExt a = new AgencyExt();
        a.setId(arg.id);
        a.setName(arg.name);
        a.setUrl(arg.url);
        a.setTimezone(arg.timezone);
        a.setLang(arg.lang);
        a.setPhone(arg.phone);
        a.setFareUrl(arg.fareUrl);
        return new AgencyExt(a);
    }

    @Override
    public AgencyType marshal(AgencyExt arg) throws Exception {
        if (arg == null) {
            return null;
        }
        return new AgencyType(arg);
    }

}
