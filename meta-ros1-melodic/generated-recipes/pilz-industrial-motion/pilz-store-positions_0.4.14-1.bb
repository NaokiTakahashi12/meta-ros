# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Allows to store poses during teach-in."
AUTHOR = "Joachim Schleicher <j.schleicher@pilz.de>"
HOMEPAGE = "https://github.com/PilzDE/pilz_industrial_motion/issues"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "LGPLv3"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=b691248d2f70cdaeeaf13696ada5d47c"

ROS_CN = "pilz_industrial_motion"
ROS_BPN = "pilz_store_positions"

ROS_BUILD_DEPENDS = " \
    roslint \
    rospy \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    libyaml \
    rospy \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ${PYTHON_PN}-mock \
    ${PYTHON_PN}-pytest-cov \
    code-coverage \
    ros-pytest \
    rostest \
    visualization-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/PilzDE/pilz_industrial_motion-release/archive/release/melodic/pilz_store_positions/0.4.14-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pilz_store_positions"
SRC_URI = "git://github.com/PilzDE/pilz_industrial_motion-release;${ROS_BRANCH};protocol=https"
SRCREV = "d05544981203b8c73e63b932d12737436b5170e7"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}