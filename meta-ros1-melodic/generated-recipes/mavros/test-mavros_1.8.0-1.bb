# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Tests for MAVROS package"
AUTHOR = "Vladimir Ermakov <vooon341@gmail.com>"
ROS_AUTHOR = "Nuno Marques <n.marques21@hotmail.com>"
HOMEPAGE = "https://github.com/mavlink/mavros.git"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD & GPLv3 & LGPLv3"
LICENSE = "BSD & GPL-3.0-only & LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mavros"
ROS_BPN = "test_mavros"

ROS_BUILD_DEPENDS = " \
    angles \
    cmake-modules \
    control-toolbox \
    eigen-conversions \
    geometry-msgs \
    libeigen \
    mavros \
    mavros-extras \
    roscpp \
    std-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    control-toolbox \
    eigen-conversions \
    geometry-msgs \
    libeigen \
    mavros \
    mavros-extras \
    roscpp \
    std-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    control-toolbox \
    eigen-conversions \
    geometry-msgs \
    libeigen \
    mavros \
    mavros-extras \
    roscpp \
    std-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/mavlink/mavros-release/archive/release/melodic/test_mavros/1.8.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/test_mavros"
SRC_URI = "git://github.com/mavlink/mavros-release;${ROS_BRANCH};protocol=https"
SRCREV = "26fb5e3d0a5c4f4d0d0266b7d081192ab370c756"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}